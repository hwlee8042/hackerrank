package algorithm.dayOfTheProgrammer;

public class DayOfProgrammerImpl implements DayOfProgrammer {

    private CalcOfRussiaDate calcOfRussiaDate = new CalcOfRussiaDate();
    //refectoring 한번에 하나만 바꾸기
    // 바뀔 수 있는 경우에 대해 생각!
    private static final int DAY_OF_PROGRAMMER = 256;
    private static final int MISSING_FEB = 215;

    @Override
    public String solve(int year) {
        String result = "";
        int feb = 0;
        int day = DAY_OF_PROGRAMMER - MISSING_FEB;
        if(year == 1918) {
            feb = 15; //28-14+1
            result = (day+15)+".09."+year; //09바뀔때
        }else {
            feb = 28;
            if(calcOfRussiaDate.calcOfRussiaDate(year)){
                feb = 29;
            }
            result = (day+feb)+".09."+year;
        }

        return result;
    }

}
