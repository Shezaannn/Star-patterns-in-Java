package Patterns;

public class square {
    public static void main(String[] args) {

       /*
             Printing a Square
               *  *  *  *
               *  *  *  *
               *  *  *  *
               *  *  *  *
        */


        //Way 1
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        //Way 2
        /* for (int i=0; i<4; i++){
            System.out.println("*  *  *  *");
        }*/
    }
}
