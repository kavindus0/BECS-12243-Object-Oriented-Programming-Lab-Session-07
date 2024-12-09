public class q7_02 {
    //
//    b. Write a Java program that uses a for loop to print all even numbers from 1 to 20. Use
//    the continue statement to skip odd numbers and avoid printing them.
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i%2==1){
                continue;
            }
            System.out.println(i);

        }
    }
}
