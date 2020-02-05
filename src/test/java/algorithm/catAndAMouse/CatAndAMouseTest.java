package algorithm.catAndAMouse;

import algorithm.catAndMouse.CatAndMouse;
import algorithm.catAndMouse.CatAndMouseImpl;
import algorithm.catAndMouse.CatAndMouseInterface;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/*
 q >= 1 && q <= 100
 1 <= x, y, z <= 100
*/
public class CatAndAMouseTest {

    private CatAndMouse catAndMouse;
    CatAndMouseInterface catAndMouseInterface = new CatAndMouseImpl();

    @Before
    public void init() {
        this.catAndMouse = new CatAndMouse();
    }

    @Test
    public void catAndAMouseTest1() {
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

    @Test
    public void catAndAMouseTest2() {

        //x,y,z
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        List<Integer> input2 = Arrays.asList(1, 3, 2);
        //assertThat
        List<String> expected = Arrays.asList("Cat B", "Mouse C");

        assertTest(expected, catAndMouseInterface.catAndMouseList(input1, input2));

    }
    private void assertTest(List<String> expected, List<String> result) {

    }
}
