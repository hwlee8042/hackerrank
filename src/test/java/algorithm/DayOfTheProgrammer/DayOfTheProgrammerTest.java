package algorithm.DayOfTheProgrammer;

import algorithm.dayOfTheProgrammer.DayOfTheProgrammer;
import algorithm.kangaroo.Kangaroo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheProgrammerTest {
    private DayOfTheProgrammer dayOfTheProgrammer;

    @Before
    public void init(){this.dayOfTheProgrammer = new DayOfTheProgrammer();}

    @Test
    public void dayOfTheProgrammerTest() {

        String year1 = dayOfTheProgrammer.dayOfProgrammer(2017);
        String year2 = dayOfTheProgrammer.dayOfProgrammer(2016);
        String year3 = dayOfTheProgrammer.dayOfProgrammer(1800);

        assertEquals("13.09.2017",year1);
        assertEquals("12.09.2016",year2);
        assertEquals("12.09.1800",year3);
    }

}
