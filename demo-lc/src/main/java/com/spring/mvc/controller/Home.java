package com.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.custom.editor.NameEditor;
import com.spring.mvc.entity.CommunicationDTO;
import com.spring.mvc.entity.Phone;
import com.spring.mvc.entity.UserDetails;
import com.spring.mvc.formater.NameFormatter;
import com.spring.mvc.validator.NameSpringValidator;

@Controller()
public class Home {
	@RequestMapping("/home")
	public String homePage(@ModelAttribute UserDetails userDetails) {
		Phone phone = new Phone();
		phone.setCode("91");
		phone.setMobile("9533511611");
		CommunicationDTO dto = new CommunicationDTO();
		dto.setPhone(phone);
		userDetails.setCommunicationDTO(dto);
		return "inputForm";
	}

	@RequestMapping("/showForm")
	public String inputForm() {
		return "inputForm";
	}

	@RequestMapping("/process-input-form")
	public String process_input_form(@RequestParam("userName") String userName, @RequestParam("subject") String subject,
			Model model) {
		model.addAttribute("userName", userName);
		model.addAttribute("subject", subject);
		return "showDetails";
	}

	// Entity model
	@RequestMapping("/process-input-form-entity-normal")
	public String process_input_form_entity(UserDetails userDetails, Model model) {
		System.out.println("User Name : " + userDetails.getUserName());
		System.out.println("Subject : " + userDetails.getSubject());
		model.addAttribute("userDetails", userDetails);
		return "showDetails";
	}

	// Entity model with @Model annotation
	@RequestMapping("/process-input-form-entity")
	public String process_input_form_entity1(@Valid @ModelAttribute("userDetails") UserDetails userDetails1,
			BindingResult results) {
		if (results.hasErrors()) {
			for (ObjectError err : results.getAllErrors())
				System.out.println(err);

			return "inputForm";
		}
		System.out.println("User Name : " + userDetails1.getUserName());
		System.out.println("Subject : " + userDetails1.getSubject());
		System.out.println("Age : " + userDetails1.getAge());
		return "showDetails";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		System.out.println("init Binder Working");
		//dataBinder.setDisallowedFields("userName");
		//StringTrimmerEditor st = new StringTrimmerEditor(true);
		//dataBinder.registerCustomEditor(String.class, "userName", st);
		NameFormatter nameFormatter = new NameFormatter();
		
		//custom formatter
		//dataBinder.addCustomFormatter(nameFormatter, "userName");
		
		//Custom Editor
		//NameEditor nameEditor = new NameEditor();
		//dataBinder.registerCustomEditor(String.class,"userName",nameEditor);
		dataBinder.addValidators(new  NameSpringValidator());
	}
	

}
