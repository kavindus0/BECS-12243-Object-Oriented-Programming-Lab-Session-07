import java.util.Scanner;

public class q2 {
//    . Write a Java program that asks the user for their age and determines if they are eligible to
//    vote and if they are eligible for senior citizen benefits. Use nested if statements.
//• If the age is 18 or older, print
//            • If the age is 65 or older, print
//            • Otherwise, print
//            • If the age is below 18, print
public static void main(String[] args) {
    Scanner ageInpu = new Scanner(System.in);
    int age = ageInpu.nextInt();
    if(age >=18){
        System.out.println("You are eligible to vote.");
        if (age >= 65) {
            System.out.println("You are also eligible for senior citizen benefits.");
        } else {
            System.out.println("You are not eligible for senior citizen benefits.");
        }

    } else {
        System.out.println("You are not eligible to vote.");
    }


}
}
