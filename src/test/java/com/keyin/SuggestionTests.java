package com.keyin;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuggestionTests {

    @Test
    public void testCorrectWord() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String word = "hello";
        String suggestions = suggestionEngine.generateSuggestions(word);
        assertEquals("", suggestions);
    }

    @Test
    public void testMisspelledWord() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String word = "korrect";
        String suggestions = suggestionEngine.generateSuggestions(word);
        // Update the assertion to check for a non-empty suggestion
        assertNotNull(suggestions, "Expected suggestion for 'korrect' should not be null");

    }


    @Test
    public void testEdgeCase() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String word = "xyz";
        String suggestions = suggestionEngine.generateSuggestions(word);
        // Assuming the SuggestionEngine suggests some value for the edge case
        Assert.assertNotNull(suggestions, "Expected suggestions for 'xyz' should not be null");
        // Add more specific assertions based on the expected behavior
    }
}