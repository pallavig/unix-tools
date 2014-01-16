package pallavig.unixtools.uniq;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqTest {
    @Test
    public void testGetUniqLines() throws Exception {
        String data = "java\r\nkunal\r\nkunal\r\njava";
        String expected = "java\r\nkunal\r\njava\r\n";
        Uniq uniq = new Uniq(data);

        String actual = uniq.getUniqLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetUniqLinesWhenAllLinesAreEqual() throws Exception {
        String data = "java\r\njava\r\njava";
        String expected = "java\r\n";
        Uniq uniq = new Uniq(data);

        String actual = uniq.getUniqLines();

        assertEquals(expected,actual);
    }
}