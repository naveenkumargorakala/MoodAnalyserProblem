package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message){
        if (message.equalsIgnoreCase("I am in sad Mood")){
            return "SAD";
        }else
            return  "Happy";
    }
}
