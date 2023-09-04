package com.wb.exception;

public class ListNotFoundException extends RuntimeException
{
	public ListNotFoundException()
	{
		
	}
	public ListNotFoundException(String msg)
	{
		super(msg);
	}
}
