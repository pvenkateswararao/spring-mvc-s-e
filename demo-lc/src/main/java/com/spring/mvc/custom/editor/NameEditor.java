package com.spring.mvc.custom.editor;

import java.beans.PropertyEditorSupport;

public class NameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String s= text.toUpperCase();
		setValue(s);
	}

}
