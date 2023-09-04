package com.wb.exception;

public class EmptyListException extends RuntimeException 
{
   public EmptyListException() 
	{
	
	}

	public EmptyListException(String msg) 
	{
		super(msg);
	}
}
