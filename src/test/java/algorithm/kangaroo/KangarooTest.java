package algorithm.kangaroo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KangarooTest {

    private Kangaroo kangaroo;

    @Before
    public void init(){this.kangaroo = new Kangaroo();}

    @Test
    public void kangarooTest() {
        String output1 = kangaroo.jumpResult(0, 3, 4, 2);
        String output2 = kangaroo.jumpResult(0, 2, 5, 3);
        String output3 = kangaroo.jumpResult(43, 2, 70, 2);

        assertEquals("YES",output1);
        assertEquals("NO",output2);
        assertEquals("NO",output3);
    }

}
