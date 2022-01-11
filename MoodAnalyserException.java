package com.bridgelabz.moodanalyser;

public class MoodAnalyserException extends RuntimeException{

    public ExceptionType type;
    public String message;
    public enum ExceptionType{
        Null,EmptyString
    }
    public MoodAnalyserException(String message,ExceptionType type) {
        super(message);
        this.type = type;
    }

}
