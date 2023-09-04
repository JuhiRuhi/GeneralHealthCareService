package com.wb.exception;

public class ListNotPresentException extends RuntimeException 
{

	public ListNotPresentException()
	{
		super();
	}
	
	public ListNotPresentException(String msg)
	{
		super(msg);
	}

}
