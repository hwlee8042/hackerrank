package algorithm.dayOfTheProgrammer;

import algorithm.kangaroo.Kangaroo;

public class DayOfProgrammerTestImpl implements DayOfProgrammerTest {

    private CalcOfRussiaDate calcOfRussiaDate = new CalcOfRussiaDate();

    public static final int DAYOFPROGRAMMER = 256;
    public static final int MISSINGFEB = 215;

    @Override
    public String solve(int year) {
        String result = "";
        int feb = 0;
        int day = DAYOFPROGRAMMER -MISSINGFEB;
        if(year == 1918) {
            feb = 15;
            result = (day+15)+".09."+year;
        }else {
            if(calcOfRussiaDate.calcOfRussiaDate(year)){
                feb = 29;
                result = (day+feb)+".09."+year;
            }else{
                feb = 28;
                result = (day+feb)+".09."+year;
            }
        }

        return result;
    }

}
