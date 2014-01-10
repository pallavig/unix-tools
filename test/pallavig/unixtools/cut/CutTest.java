package pallavig.unixtools.cut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutTest {
    @Test
    public void testCutLines() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "a\nd\ng\n";
        Cut cut = new Cut(data,1," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testCOuntLinesForSeondField() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "b\ne\nh\n";
        Cut cut = new Cut(data,2," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);

    }

    @Test
    public void testCountLinesONAbsentField() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "\n\n\n";
        Cut cut = new Cut(data,4," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);
    }
}
