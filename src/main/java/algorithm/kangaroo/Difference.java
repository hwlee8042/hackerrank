package algorithm.kangaroo;

/*
example1
예를 들어, 캥거루 1이 x1=2에서 시작하고 점프 거리 v1=1 이고, 캥거루 2는 x2=1에서 시작하고 점프거리 v2=2이다.
한번 점프 후에, 둘다 x=3이다, (x1+v1=2+1, x2+v2=1+2), 그래서 우리의 대답은 YES이다.

example2 0, 2, 5, 3 // 0, 3, 4, 2 //43, 2, 70, 2
x2 > x1 : 출발지가 x2가 앞에 있을 때
두번째 캥거루의 속도가 더 빠르고 이미 첫번째 캥거루보다 앞서 있기 때문에, 첫번째 캥거루는 결코 따라잡을 수 없다.
*/

public class Difference {

    public static String twoValueDifference(int x1, int v1, int x2, int v2){
        String result = "";
        if(v1 < v2) result = "NO";
        if(x1 < x2){
            int pointDiff = Math.abs(x1-x2);
            int distanceDiff = Math.abs(v1-v2);
            if(v1 > v2){
                if(pointDiff % distanceDiff == 0){
                    result = "YES";
                }else {
                    result = "NO";
                }
            }else{
                result = "NO";
            }
        }
        return result;
    }
}
