package pallavig.unixtools.uniq;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqTest {
    @Test
    public void testGetUniqLines() throws Exception {
        String data = "java\nkunal\nkunal\njava";
        String expected = "java\nkunal\njava\n";
        Uniq uniq = new Uniq(data);

        String actual = uniq.getUniqLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetUniqLinesWhenAllLinesAreEqual() throws Exception {
        String data = "java\njava\njava";
        String expected = "java\n";
        Uniq uniq = new Uniq(data);

        String actual = uniq.getUniqLines();

        assertEquals(expected,actual);
    }
}