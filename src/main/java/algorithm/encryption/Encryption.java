package algorithm.encryption;

/*
L <= row <= column <= L
row * column >= L
Math.floor() : 소수값 버리는 function
Math.ceil() : 소수값 반올림 function
*/

public class Encryption {
    public String solve(String inputString) {
        String result = "";
        int inputStringLength = inputString.length();
        char[] inputCharacters = inputString.toCharArray();

        int rows = calcRows(inputStringLength);
        int columns = calcColumns(inputStringLength, rows);

        rows = (inputStringLength > rows*columns) ? columns : rows;

        for(int i=0; i < columns; i++) {
            int index = i;

            for(int j=0; j < rows; j++) {
                if(index < inputStringLength) {
                    result += inputCharacters[index];
                }
                index += columns;
            }
            if(i != columns-1){
                result += " ";
            }
        }

        return result;
    }

    private int calcRows(int inputStringLength) {
        double L = Math.sqrt(inputStringLength);
        int rows =  (int)Math.floor(L);

        return rows;
    }

    private int calcColumns(int inputStringLength, int rows) {
        double L = Math.sqrt(inputStringLength);
        int columns = inputStringLength > rows * rows ? (int)Math.ceil(L) : rows;

        return columns;
    }
}
