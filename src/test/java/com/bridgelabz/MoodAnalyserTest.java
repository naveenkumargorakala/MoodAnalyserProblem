package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    static MoodAnalyser moodAnalyser;
    @BeforeAll
    public static void init(){
        moodAnalyser = new MoodAnalyser();
        System.out.println("Implement to all");
    }
    @Test
    void givenMessageWhenCheckedReturnSad(){
        String mood=moodAnalyser.analyseMood("I am in sad Mood");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    void givenMessageWhenCheckedReturnHappy(){
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assertions.assertEquals("Happy",mood);
    }
}
