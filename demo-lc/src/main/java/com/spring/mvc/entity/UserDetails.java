package com.spring.mvc.entity;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import com.spring.mvc.annotation.Age;

@Component
public class UserDetails {
	@NotBlank(message = "User Name is required field")
	public String userName;
	public String subject;
	public CommunicationDTO communicationDTO;
	
	@Age(min = 10, max=20)
	public Integer age;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
