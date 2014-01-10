package pallavig.unixtools.head;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadTest {
    @Test
    public void testGetHeader() throws Exception {
        String data = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl";
        String expected = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj";
        Head head = new Head(data,10);

        String actual = head.getHeader();

        assertEquals(expected,actual);
    }

    @Test
    public void testHeaderWhenLessLinesPresentThanExpected() throws Exception {
        String data = "pallavi\ngoliwale";
        String expected = "pallavi\ngoliwale";
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