package algorithm.catAndAMouse;

import algorithm.catAndMouse.CatAndMouse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/*
 q >= 1 && q <= 100
 1 <= x, y, z <= 100
*/
public class CatAndAMouseTest {

    private CatAndMouse catAndMouse;

    @Before
    public void init() {
        this.catAndMouse = new CatAndMouse();
    }

    @Test
    public void catAndAMouseTest() {
        //validate
        int queryLine = 2;
        int x1 = 1;
        int y1 = 2;
        int z1 = 3;

        String expected1 = "Cat B";
        String result1 = catAndMouse.catAndMouse(x1, y1, z1);
        assertThat(result1, is(expected1));

        int x2 = 1;
        int y2 = 3;
        int z2 = 2;

        String expected2 = "Mouse C";
        String result2 = catAndMouse.catAndMouse(x2, y2, z2);
        assertThat(result2, is(expected2));
    }
}
