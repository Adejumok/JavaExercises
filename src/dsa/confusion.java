package dsa;

public class confusion {
    public static void main(String[] args) {
        System.out.println(ifConfusion(3, 7));
        System.out.println(ifConfusion(8, 5));
    }

    private static char ifConfusion(int x, int y){
        if (x>y){
            if ((x-5) > 0){
                x = y;
                return 'A';
//                if (y == y + y) {
//                    return 'B';}
            } else if (x + y > 0) {
                while (x > y){
                    x -= 1;
                }
                while (y > x){
                    y -= 1;
                }
                if (x == y){
                    return 'E';
                }
            }
        }
        else {
            if ((x - 2) > (y - 4)){
                int x_old = x;
                x = y * y;
                y = 2 * x_old;
                if (((x-4) ^ 2 ) > ((y - 7) ^ 2)){
                    return 'C';
                }
                return 'D';
            }
            return 'H';
        }
        return 'Q';
    }
}
