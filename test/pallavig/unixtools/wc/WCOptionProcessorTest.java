package pallavig.unixtools.wc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCOptionProcessorTest {
    @Test
    public void testGetIsCountLines() throws Exception {
        String args[] = {"-l"};
        WCOptionProcessor wcOptions = new WCOptionProcessor(args);
        assertEquals(true,wcOptions.getIsCountLines());
        assertEquals(false,wcOptions.getIsCountWords());
        assertEquals(false,wcOptions.getIsCountCharacters());
        assertEquals(null,wcOptions.getFileName());
    }

    @Test
    public void testGetIsCountWords() throws Exception {
        String[] args = {"-w"};
        WCOptionProcessor wcOptions = new WCOptionProcessor(args);
        assertEquals(false,wcOptions.getIsCountLines());
        assertEquals(true,wcOptions.getIsCountWords());
        assertEquals(false,wcOptions.getIsCountCharacters());
        assertEquals(null,wcOptions.getFileName());
    }

    @Test
    public void testGetIsCountCharacters() throws Exception {
        String args[] = {"-c"};
        WCOptionProcessor wcOptions = new WCOptionProcessor(args);
        assertEquals(false,wcOptions.getIsCountLines());
        assertEquals(false,wcOptions.getIsCountWords());
        assertEquals(true,wcOptions.getIsCountCharacters());
        assertEquals(null,wcOptions.getFileName());
    }

    @Test
    public void testGetFileName() throws Exception {
        String args[] = {"a.txt","-c"};
        WCOptionProcessor wcOptions = new WCOptionProcessor(args);
        assertEquals(false,wcOptions.getIsCountLines());
        assertEquals(false,wcOptions.getIsCountWords());
        assertEquals(true,wcOptions.getIsCountCharacters());
        assertEquals("a.txt",wcOptions.getFileName());
    }

    @Test
    public void testOptionProcessorWithoutAnyOptionalArguments() throws Exception {
        String args[] = {"a.txt"};
        WCOptionProcessor wcOptions = new WCOptionProcessor(args);
        assertEquals(true,wcOptions.getIsCountLines());
        assertEquals(true,wcOptions.getIsCountWords());
        assertEquals(true,wcOptions.getIsCountCharacters());
        assertEquals("a.txt",wcOptions.getFileName());
    }
}
