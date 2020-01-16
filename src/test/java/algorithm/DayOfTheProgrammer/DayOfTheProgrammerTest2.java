package algorithm.DayOfTheProgrammer;

import algorithm.dayOfTheProgrammer.DayOfProgrammerTest;
import algorithm.dayOfTheProgrammer.DayOfProgrammerTestImpl;
import org.junit.Test;

public class DayOfTheProgrammerTest2 {
    @Test
    public void DayOfTheProgrammerTest() {
        DayOfProgrammerTest dayOfProgrammerTest = new DayOfProgrammerTestImpl();

        int year = 2017;
        String expected = "13.09.2017";

        String result = dayOfProgrammerTest.solve(year);
    }

    @Test
    public void DayOfTheProgrammerTest2() {
        DayOfProgrammerTest dayOfProgrammerTest = new DayOfProgrammerTestImpl();

        int year = 2016;
        String expected = "12.09.2017";

        String result = dayOfProgrammerTest.solve(year);
    }
}
