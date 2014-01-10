package pallavig.unixtools.tail;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailTest {
    @Test
    public void testGetLines() throws Exception {
        String data = "a\nb\nc";
        Tail tail = new Tail(data,2);
        String expected = "b\nc";

        String actual = tail.getLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetLinesWhenLessLinesArePresentThanExpected(){
        String data = "a\nb\nc";
        Tail tail = new Tail(data,10);
        String expected = "a\nb\nc";

        String actual = tail.getLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testHeaderWhenDataIsEmptyString() throws Exception {
        String data = "";
        String expected = "";
        Tail head = new Tail(data,10);

        String actual = head.getLines();

        assertEquals(expected,actual);
    }
}