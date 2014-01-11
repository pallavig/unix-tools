package pallavig.unixtools.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void testSortData() throws Exception {
        String data = "b\nc\na";
        String expected = "a\nb\nc\n";
        Sort sort = new Sort(data);

        String actual = sort.sortData();

        assertEquals(expected,actual);
    }

    @Test
    public void testSortDataInDescendingOrder() throws Exception {
        String data = "b\nc\na";
        String expected = "c\nb\na\n";
        Sort sort = new Sort(data,true);

        String actual = sort.sortData();

        assertEquals(expected,actual);

    }
}
