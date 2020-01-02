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

        for(Integer i : grades) {
            int grade = grades.get(i);
            if(grade >= 38) {
                int multipleOf5 = 5 - (grade % 5) + grade;
                if(multipleOf5 - grade < 3) {
                    grade = multipleOf5;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }


    /*public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int scLength = 0;

        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            scLength += num;
        }

        List<Integer> grades = new ArrayList<>();

        for(int i=0; i<grades.size(); i++){
            grades.add(sc.nextInt());
        }

        result = gradingStudentList(grades);

        for(Integer tmp : result) {

        }
    }*/
}
