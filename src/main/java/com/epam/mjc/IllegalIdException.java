package com.epam.mjc;

public class IllegalIdException extends IllegalArgumentException{

    public IllegalIdException(long id) {
        super("Could not find student with ID " + id);
    }
}
