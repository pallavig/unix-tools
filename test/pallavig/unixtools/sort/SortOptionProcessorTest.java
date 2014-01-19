package pallavig.unixtools.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortOptionProcessorTest {
    @Test
    public void testOptionProcessorWithOnlyFilename() throws Exception {
        String args[] = {"a.txt"};
        SortOptionProcessor sop = new SortOptionProcessor(args);
        assertEquals(sop.getDelimiter()," ");
        assertEquals(sop.getFieldNumber(),1);
        assertEquals(sop.getFilename(),"a.txt");
        assertEquals(sop.getIsReverse(),false);
    }

    @Test
    public void testOptionProcessorWithDelimiterAsColan() throws Exception {
        String args[] = {"a.txt","-d:"};
        SortOptionProcessor sop = new SortOptionProcessor(args);
        assertEquals(sop.getDelimiter(),":");
        assertEquals(sop.getFieldNumber(),1);
        assertEquals(sop.getFilename(),"a.txt");
        assertEquals(sop.getIsReverse(),false);
    }

    @Test
    public void testOptionProcessorWithFieldNumber() throws Exception {
        String args[] = {"-f2","a.txt"};
        SortOptionProcessor sop = new SortOptionProcessor(args);
        assertEquals(sop.getDelimiter()," ");
        assertEquals(sop.getFieldNumber(),2);
        assertEquals(sop.getFilename(),"a.txt");
        assertEquals(sop.getIsReverse(),false);
    }

    @Test
    public void testOptionProcessorWithReverseArgument() throws Exception {
        String args[] = {"-r","a.txt"};
        SortOptionProcessor sop = new SortOptionProcessor(args);
        assertEquals(sop.getDelimiter()," ");
        assertEquals(sop.getFieldNumber(),1);
        assertEquals(sop.getFilename(),"a.txt");
        assertEquals(sop.getIsReverse(),true);
    }

    @Test
    public void testOptionProcessorWithAllArguments() throws Exception {
        String args[] = {"-f2","-d;","-r","a.txt"};
        SortOptionProcessor sop = new SortOptionProcessor(args);
        assertEquals(sop.getDelimiter(),";");
        assertEquals(sop.getFieldNumber(),2);
        assertEquals(sop.getFilename(),"a.txt");
        assertEquals(sop.getIsReverse(),true);
    }
}
