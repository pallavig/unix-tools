package pallavig.unixtools.head;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadTest {
    @Test
    public void testGetHeader() throws Exception {
        String data = "a\r\nb\r\nc\r\nd\r\ne\r\nf\r\ng\r\nh\r\ni\r\nj\r\nk\r\nl";
        String expected = "a\r\nb\r\nc\r\nd\r\ne\r\nf\r\ng\r\nh\r\ni\r\nj";
        Head head = new Head(data,10);

        String actual = head.getHeader();

        assertEquals(expected,actual);
    }

    @Test
    public void testHeaderWhenLessLinesPresentThanExpected() throws Exception {
        String data = "pallavi\r\ngoliwale";
        String expected = "pallavi\r\ngoliwale";
        Head head = new Head(data,10);

        String actual = head.getHeader();

        assertEquals(expected,actual);
    }

    @Test
    public void testHeaderWhenDataIsEmptyString() throws Exception {
        String data = "";
        String expected = "";
        Head head = new Head(data,10);

        String actual = head.getHeader();

        assertEquals(expected,actual);
    }
}