package patterns;

public class sameNumberSquare {
    static void main(String[] args) {
        /*
          Same Number Square
            1  1  1  1  1
            2  2  2  2  2
            3  3  3  3  3
            4  4  4  4  4
            5  5  5  5  5
         */


        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j<5; j++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }

    }
}
