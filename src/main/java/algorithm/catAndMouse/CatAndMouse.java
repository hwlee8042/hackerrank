package algorithm.catAndMouse;
/*
If cat A catches the mouse first, print Cat A
If cat B catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print `Mouse C` as the two cats fight and mouse escapes.
*/
public class CatAndMouse {
    public String catAndMouse(int x, int y, int z) {
        String result = "";
        int betweenXZ = Math.abs(x-z);
        int betweenYZ = Math.abs(y-z);

        if(betweenXZ < betweenYZ) {
            result = "Cat A";
        }else if(betweenXZ > betweenYZ) {
            result = "Cat B";
        }else {
            result = "Mouse C";
        }

        return result;
    }
}
