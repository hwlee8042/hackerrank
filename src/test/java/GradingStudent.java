import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class GradingStudent {

    //private static Logger logger = Logger.getLogger(GradingStudent.class);

    static int[] gradingStudent(int[] grades) {

        for(int i=0 ; i<grades.length; i++){

            if(grades[i] >= 38){

                int test = 5 - (grades[i] % 5) + grades[i];
                if(test - grades[i] < 3){
                    grades[i] = test;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] grades = new int[num];

        for(int i=0; i<num; i++){
            grades[i] = sc.nextInt();
        }

        int[] result = gradingStudent(grades);

        for(int j=0; j<result.length; j++) {
     //       logger.info("", result[j]);
            System.out.println(result[j]);
        }
    }
}
