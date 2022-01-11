package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    String message ;


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String  analyseMood() throws MoodAnalyserException {
        try {
            if(message == null) {
                throw new  MoodAnalyserException("Message cast can't be null", MoodAnalyserException.ExceptionType.Null);
            }
            else if(message.equals("")){
                throw new  MoodAnalyserException("Message cast can't be empty", MoodAnalyserException.ExceptionType.EmptyString);
            }

            else if(message.contains("Sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch(MoodAnalyserException e) {

            System.out.println(e);
            return "HAPPY";
        }

    }
}
