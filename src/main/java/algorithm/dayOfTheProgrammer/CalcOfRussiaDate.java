package algorithm.dayOfTheProgrammer;

public class CalcOfRussiaDate {
    public static boolean calcOfRussiaDate(int year) {
        boolean clacResult = false;

        if(year >= 1700 && year <= 1917) clacResult = year % 4 == 0;
        else if(year >= 1918 && year <= 2700) clacResult =(year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)));

        return clacResult;
    }
}
