package patterns;

public class rectangle {
    public static void main(String[] args) {

            /*
                 Printing this pattern
                  *  *  *  *  *  *  *
                  *  *  *  *  *  *  *
                  *  *  *  *  *  *  *
                  *  *  *  *  *  *  *
            */

        for (int i=0; i<4; i++){   //outer loop for rows
            for (int j=0; j<6; j++){   //inner loop for columns
                System.out.print("*  ");
            }
            System.out.println();   // to break line after every row
        }

    }
}
