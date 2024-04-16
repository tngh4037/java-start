package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 5;

        /*
        결과)
        *
        **
        ***
        ****
        *****
         */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        /*
        결과)
             *
            **
           ***
          ****
         *****
         */
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= 1; j--) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
