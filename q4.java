public class q4 {

//    Write a Java program to display the following pattern using a loop,
//*
//        **
//        ***
//        ****
//        *****
//        ******

    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < i; j++) {

            System.out.print("*");
            }
            System.out.println();

        }
    }
}
