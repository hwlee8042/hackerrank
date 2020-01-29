package algorithm.birthdayChocolate;

import java.util.List;

public class BirthdayChocolate {
    public int solve(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;
        if(m == 1) {
            if(s.get(0) == d) {
                count++;
            }
        }else {
            for(int j=0; j < s.size()-m; j++){
                sum = 0;
                for(int i=0; i < m; i++) {//m=1
                    sum += s.get(j+i);//s=4
                }
                if(sum == d) count++;
            }
        }
        return count;
    }
}
