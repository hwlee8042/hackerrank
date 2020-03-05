package algorithm.legoBlocks;

public class LegoBlocks {

    private static final int MODULO = (int)(Math.pow(10, 9)) + 7;

    public int legoBlocks(int n, int m) {
        int result = 0;
        int heightOfWall = n;
        int widthOfWall = m;

        int widthMax = (int)Math.pow(m, (n-1));

        result = widthMax % MODULO;

        return result;
    }

}
