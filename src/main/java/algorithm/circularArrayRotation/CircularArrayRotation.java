package algorithm.circularArrayRotation;

public class CircularArrayRotation {

    public int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result = new int[queries.length];

        int[] tmpArray = solve(a, k, queries);

        for(int r=0; r<queries.length; r++) {
            result[r] = tmpArray[queries[r]];
        }

        return result;
    }

    private int[] solve(int[] a, int k, int[] queries) {
        int[] results = new int[queries.length];
        int rotationCnt = k % a.length;
        int newIdx = 0;

        for(int i = rotationCnt; i<a.length; i++) {
            results[i] = a[newIdx++];
        }

        int rotationIdx = a.length - rotationCnt;
        for(int j=0; j<rotationCnt; j++) {
            results[j] = a[rotationIdx++];
        }

        return results;
    }


}
