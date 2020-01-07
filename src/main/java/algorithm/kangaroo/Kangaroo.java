package algorithm.kangaroo;

/*
input format : x1, v1, x2, v2의 각 값을 나타내는 네 개의 공간 구분 정수의 단일 라인.
output format : YES if they can land on the same location at the same time; otherwise, print NO.
*/

public class Kangaroo {
    public static String jumpResult(int x1, int v1, int x2, int v2) {
        String result = "";
        if(x1 == x2 && v1 == v2) result = "YES";
        else{
            result = Difference.twoValueDifference(x1, v1, x2, v2);
        }
        return result;
    }

}
