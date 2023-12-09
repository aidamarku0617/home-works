package review4;

public class DoWhileLoop {
    public static void main(String[] args) {
        //do while -when we do not know  in advance
        //how many times we want to repeat block of code
        /* while vs do while
        in do while block of code will be executed at least once even when condition is false
         */
        // i want to say hello 4 times


        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        {

           int  ii = 2;
            do {
                if (ii % 2 == 0) {

                    System.out.print(i + " ");
                }
                ii++;
            } while (ii <= 10);

        }
    }
}