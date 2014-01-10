package pallavig.unixtools.reducespaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceReducerTest {
    @Test
    public void testReduceSpaces() throws Exception {
        String data = "pallavi   prakash    goliwale\nprateek";
        SpaceReducer sp = new SpaceReducer(data);
        String expected = "pallavi prakash goliwale\nprateek";

        String actual = sp.reduceSpaces();

        assertEquals(expected,actual);
    }
}
