package pallavig.unixtools.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void testSortData() throws Exception {
        String data = "b\nc\na";
        String expected = "a\nb\nc\n";
        Sort sort = new Sort(data,1,false,"\t");

        String actual = sort.sortData();

        assertEquals(expected,actual);
    }

    @Test
    public void testSortDataInDescendingOrder() throws Exception {
        String data = "b\nc\na";
        String expected = "c\nb\na\n";
        Sort sort = new Sort(data,1,true," ");

        String actual = sort.sortData();

        assertEquals(expected,actual);

    }

    @Test
    public void testSortOnFieldTwo() throws Exception {
        String data = "a d c\nb c e";
        String expected = "b c e\na d c\n";
        Sort sort = new Sort(data,2,false," ");

        String actual = sort.sortData();

        assertEquals(expected,actual);
    }

    @Test
    public void testSortOnFieldWhenValueIsSame() throws Exception {
        String data = "i k\ni j";
        String expected= "i j\ni k\n";
        Sort sort = new Sort(data,1,false," ");

        String actual = sort.sortData();

        assertEquals(expected,actual);
    }
}