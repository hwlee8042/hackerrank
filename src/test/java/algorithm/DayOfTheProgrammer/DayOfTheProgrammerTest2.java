package algorithm.DayOfTheProgrammer;

import algorithm.dayOfTheProgrammer.DayOfProgrammer;
import algorithm.dayOfTheProgrammer.DayOfProgrammerImpl;
import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DayOfTheProgrammerTest2 {
    @Test
    public void DayOfTheProgrammerTest() {
        DayOfProgrammer dayOfProgrammerTest = new DayOfProgrammerImpl();

        int year = 2017;
        int year1 = 2016;
        int year2 = 1800;
        String expected = "13.09.2017";
        String expected1 = "12.09.2016";
        String expected2 = "12.09.1800";

        String result = dayOfProgrammerTest.solve(year);
        assertThat(result, CoreMatchers.is(expected));
        assertThat(result, CoreMatchers.is(expected1));
        assertThat(result, CoreMatchers.is(expected2));
    }
}
