package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    static MoodAnalyser moodAnalyser;
    @BeforeAll
    public static void init(){
        moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        System.out.println("Implement to all");
    }
    @Test
    void givenMessageWhenCheckedReturnSad(){
        String mood=moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    void givenMessageWhenCheckedReturnHappy(){
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy",mood);
    }
}
