package algorithm.circularArrayRotationTest;

import algorithm.circularArrayRotation.CircularArrayRotation;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
n : Array element
k : rotation count
q : return index
*/
public class CircularArrayRotationTest {

    private CircularArrayRotation circularArrayRotation;

    @Before
    public void init() {
        this.circularArrayRotation = new CircularArrayRotation();
    }


    @Test
    public void circularArrayRotationTest(){
        int n = 3;
        int k = 2;
        int q = 3;

        int[] a = {1,2,3};
        int[] queries = {0,1,2};
        int[] expected = {2,3,1};

        int[] result = circularArrayRotation.circularArrayRotation(a, k, queries);

        intArrayCompare(expected, result);
    }

    private void intArrayCompare(int[] expected, int[] result) {
        for(int i=0; i<expected.length; i++) {
            assertThat(result[i], is(expected[i]));
        }
    }
}
