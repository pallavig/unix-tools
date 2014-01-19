package pallavig.unixtools.cut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutOptionProcessorTest {
    @Test
    public void testOptionProcessorWithOnlyFileName() throws Exception {
        String args[] = {"a.txt"};
        CutOptionProcessor cop = new CutOptionProcessor(args);
        assertEquals(cop.getFileName(),"a.txt");
        assertEquals(cop.getDelimiter(),"\t");
        assertEquals(cop.getFieldNumbers()[0],1);
    }

    @Test
    public void testOptionProcessorWithFileNameAndDelimiter() throws Exception {
        String args[] = {"a.txt","-d;"};
        CutOptionProcessor cop = new CutOptionProcessor(args);
        assertEquals(cop.getFileName(),"a.txt");
        assertEquals(cop.getDelimiter(),";");
        assertEquals(cop.getFieldNumbers()[0],1);
    }

    @Test
    public void testOptionProcessorWithOneFieldNumber() throws Exception {
        String args[] = {"a.txt","-d;","-f3"};
        CutOptionProcessor cop = new CutOptionProcessor(args);
        assertEquals(cop.getFileName(),"a.txt");
        assertEquals(cop.getDelimiter(),";");
        assertEquals(cop.getFieldNumbers()[0],3);
    }

    @Test
    public void testOptionProcessorWithFieldNumbers() throws Exception {
        String args[] = {"a.txt","-d;","-f3,4"};
        CutOptionProcessor cop = new CutOptionProcessor(args);
        assertEquals(cop.getFileName(),"a.txt");
        assertEquals(cop.getDelimiter(),";");
        assertEquals(cop.getFieldNumbers()[0],3);
        assertEquals(cop.getFieldNumbers()[1],4);
    }
}