import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class GradingStudent2 {

    static Logger logger = Logger.getLogger(String.valueOf(GradingStudent.class));

    static List<Integer> gradingStudentList(List<Integer> grades){

        /*for(Integer i : grades) {
            int grade = grades.get(i);
            if(grade >= 38) {
                int multipleOf5 = 5 - (grade % 5) + grade;
                if(multipleOf5 - grade < 3) {
                    grade = multipleOf5;
                }
            }
        }*/
        for(int i =0 ; i < grades.size(); i++) {

            if(grades.get(i) >= 38) {
                int multipleOf5 = 5 - (grades.get(i) % 5) + grades.get(i);
                if(multipleOf5 - grades.get(i) < 3) {
                    grades.set(i,multipleOf5);
                }
            }
        }
        return grades;
    }


    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        int scLength = 0;

        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            scLength += num;

            if(scLength == sc.nextInt(0)) {
                break;
            }
        }

        List<Integer> grades = new ArrayList<>();

        for(int i=0; i<grades.size(); i++){
            grades.add(sc.nextInt());
        }

        result = gradingStudentList(grades);

        for(Integer tmp : result) {

        }
    }
}
