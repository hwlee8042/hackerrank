package algorithm.birthdayChocolate;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/*
 input format
 first line : integer n  1 <= n <= 100
 second line : 1<= s[i] <= 5 && 0 <= i < n
 third line : d = first integer, m = second integer
 1 <= d <= 31 && 1 <= m <= 12

 param
 s : array of integer
 d : Ron's birth day
 m : Ron's birth month
 */

public class BirthdayChocolateTest {
    private BirthdayChocolate birthdayChocolate;

    @Before
    public void init() {
        this.birthdayChocolate = new BirthdayChocolate();
    }

    @Test
    public void birthdayChocolateTest1() {
        List<Integer> s = new ArrayList<>(Arrays.asList(1,2,1,3,2));
        int d = 3;
        int m = 2;

        int expected = 2;
        int result = birthdayChocolate.solve(s, d, m);

        assertThat(result, is(expected));
    }
    @Test
    public void birthdayChocolateTest2() {
        List<Integer> s = new ArrayList<>(Arrays.asList(1,1,1,1,1,1));
        int d = 3;
        int m = 2;

        int expected = 0;
        int result = birthdayChocolate.solve(s, d, m);

        assertThat(result, is(expected));
    }
    @Test
    public void birthdayChocolateTest3() {
        List<Integer> s = new ArrayList<>(Arrays.asList(4));
        int d = 4;
        int m = 1;

        int expected = 1;
        int result = birthdayChocolate.solve(s, d, m);

        assertThat(result, is(expected));
    }

    @Test
    public void birthdayChocolateTest4() {
        List<Integer> s = new ArrayList<>(Arrays.asList(4, 1, 4, 3, 3, 5, 1, 2, 4, 2, 5, 1, 5, 1, 4, 1, 3, 1, 5, 2, 2,
                2, 1, 1, 3, 2, 5, 3, 1, 5, 4, 5, 2, 2, 1, 1, 2, 2, 4, 5, 4, 1, 5, 2, 1, 1, 2, 2, 1, 3, 2, 4, 4, 1, 3, 2,
                2, 3, 1, 5, 4, 4, 1, 4, 2, 1, 2, 1, 5, 1, 3, 3, 4, 2, 1, 5, 5, 4, 2, 2, 3, 3, 4, 3, 1, 2, 1, 2, 4, 3,
                16, 7));
        int d = 16;
        int m = 7;

        int expected = 13;
        int result = birthdayChocolate.solve(s, d, m);

        assertThat(result, is(expected));
    }

}
