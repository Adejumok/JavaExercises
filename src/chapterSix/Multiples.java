package chapterSix;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(isMultiple(3, 9));
        System.out.println(isMultiple(2,7));
    }

    private static boolean isMultiple(int int1, int int2){
        if (int2 % int1 == 0){
            return true;
        }
        return false;
    }
}
