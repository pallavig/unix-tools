package pallavig.unixtools.cut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutTest {
    @Test
    public void testCutLines() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "a\nd\ng";
        int fieldNumbers[] = {1};
        Cut cut = new Cut(data,fieldNumbers," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testCOuntLinesForSeondField() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "b\ne\nh";
        int fieldNumbers[] = {2};
        Cut cut = new Cut(data,fieldNumbers," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);

    }

    @Test
    public void testCountLinesOnAbsentField() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "\n\n";
        int fieldNumbers[] = {4};
        Cut cut = new Cut(data,fieldNumbers," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);
    }

    @Test
    public void testCutMultipleFields() throws Exception {
        String data = "a b c\nd e f\ng h i";
        String expected = "b c\ne f\nh i";
        int fieldNumbers[] = {2,3};
        Cut cut = new Cut(data,fieldNumbers," ");

        String actual = cut.cutLines();

        assertEquals(expected,actual);
    }
}