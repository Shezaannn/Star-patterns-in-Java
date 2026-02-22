package patterns;

public class alphabetSquare {
    static void main(String[] args) {
        /*
             Alphabet Square
              A  B  C  D  E
              A  B  C  D  E
              A  B  C  D  E
              A  B  C  D  E
              A  B  C  D  E
        */

        int n =5;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) (j + 65) + "  ");
            }
            System.out.println();
        }

    }
}
