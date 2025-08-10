package com.dn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST )
public class UnsuportedMathOperationException extends Exception
{
    public UnsuportedMathOperationException( String message )
    {
        super( message );
    }
}
