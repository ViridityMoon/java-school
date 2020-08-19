package com.lambdaschool.schools.exceptions;

public class URLNotFoundException extends RuntimeException
{
    public URLNotFoundException(String message)
    {
        super("Found an issue with School: " + message);
    }
}
