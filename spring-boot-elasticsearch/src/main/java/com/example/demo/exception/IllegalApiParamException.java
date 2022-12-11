package com.example.demo.exception;

public class IllegalApiParamException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public IllegalApiParamException(String s) {
		super(s);
	}
}
