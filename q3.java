import java.util.Scanner;

public class q3 {
//    3. Write a Java program to calculate the factorial value of a given number using the following
//    loop structures:
//    a. while loop
//    b. do-while loop
//    c. for loop

    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = scanObj.nextInt();
        final int inputNumber = number;
        ///from for loop
        int fact = 1;
        for (int i = number; i >0 ; i--) {
            fact = fact * i;
        }
        System.out.println("FOR " +fact);

        /// WHILE LOOP
        fact = 1;
        while (number > 0) {
            fact = fact * number;
            number--;
        }
        System.out.println("WHILE " + fact);


        number = inputNumber;
        /// DO WHILE LOOP
        fact = 1;
        do {
            fact = fact * number;
            number--;
        } while (number > 0);

        System.out.println("DO WHILE " + fact);



    }

}
