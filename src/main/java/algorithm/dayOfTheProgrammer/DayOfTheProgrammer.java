package algorithm.dayOfTheProgrammer;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        String result = "";
        if(year >= 1700 && year <= 1917) {
            result = year % 4 == 0 ? "12.09."+year : "13.09."+year;
        }
        else if(year == 1918) {
            //28-14+1 = 15 + 215 = 256 - 230 = 26
            result = "26.09."+year;
        }
        else if(year >= 1918 && year <= 2700) {
            result = (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) ? "12.09."+year : "13.09."+year;
        }
        return result;
    }
}
