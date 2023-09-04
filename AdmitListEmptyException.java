package com.wb.exception;

public class AdmitListEmptyException extends RuntimeException 
{
    public AdmitListEmptyException() 
	{
		
	}
    public AdmitListEmptyException(String msg) 
   	{
   		super(msg);
   	}

}
