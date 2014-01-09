package pallavig.unixtools.wc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCTest {
    @Test
    public void testCountLines() throws Exception {
        String data = "pallavi\nprakash\ngoliwale";
        WC wc = new WC(data);
        int expectedNumberOfLines = 2;

        int actualNumberOfLines = wc.countLines();

        assertEquals(expectedNumberOfLines,actualNumberOfLines);
    }

    @Test
    public void testCountCharacters() throws Exception {
        String data = "pallavi prakash";
        WC wc = new WC(data);
        int expectedNumberOfCharacters = 15;

        int actualNumberOfCharacters = wc.countCharacters();

        assertEquals(expectedNumberOfCharacters,actualNumberOfCharacters);

    }

    @Test
    public void testCountWords() throws Exception {
        String data = "pallavi prakash goliwale";
        WC wc = new WC(data);
        int expectedNumberOfWords = 3;

        int actualNumberOfWords = wc.countWords();

        assertEquals(expectedNumberOfWords,actualNumberOfWords);
    }

    @Test
    public void testCOuntWordsWhenMoreThanOneSpaceBetweenWords() throws Exception {
        String data = "pallavi prakash    goliwale";
        WC wc = new WC(data);
        int expectedNumberOfWords = 3;

        int actualNumberOfWords = wc.countWords();

        assertEquals(expectedNumberOfWords,actualNumberOfWords);
    }

    @Test
    public void testCountWordsWhenNewLInePresentInData() throws Exception {
        String data = "pallavi\nprakash\ngoliwale";
        WC wc = new WC(data);
        int expectedNumberOfWords = 3;

        int actualNumberOfWords = wc.countWords();

        assertEquals(expectedNumberOfWords,actualNumberOfWords);
    }

    @Test
    public void testCountWordsWhenCommaPresent() throws Exception {
        String data = "pallavi,prakash,goliwale";
        WC wc = new WC(data);
        int expectedNumberOfWords = 3;

        int actualNumberOfWords = wc.countWords();

        assertEquals(expectedNumberOfWords,actualNumberOfWords);

    }
}