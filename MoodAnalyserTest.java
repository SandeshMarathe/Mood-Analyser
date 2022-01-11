package com.blz;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void  givenMood_WhenHappy_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void  givenMood_WhenSad_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void  givenMood_WhenNull_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void  givenMood_WhenEmpty_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

}
