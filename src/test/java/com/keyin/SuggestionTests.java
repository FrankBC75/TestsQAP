package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        // Add assertions to verify the expected suggestions
    }

    @Test
    public void testEdgeCase() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String word = "xyz";
        String suggestions = suggestionEngine.generateSuggestions(word);
        // Add assertions to verify the expected suggestions
    }
}