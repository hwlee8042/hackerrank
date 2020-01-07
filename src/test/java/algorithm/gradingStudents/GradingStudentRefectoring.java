package algorithm.gradingStudents;

import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class GradingStudentRefectoring {

    static List<Integer> gradingStudentList(List<Integer> grades){

        List<Integer> result = new ArrayList<>();

        for(Integer grade : grades) {
            result.add(calculateGrade(grade));
        }
        return grades;
    }

    private static int calculateGrade(int originValue) {
        int resultValue = originValue;
        int multipleValue = 5 - (originValue % 5) + originValue;

        if(originValue >= 38) {
            if(multipleValue - originValue < 3) {
                resultValue = multipleValue;
            }
        }
        return resultValue;
    }

}
