import java.util.Scanner;

public class Q5 {

public static void main(String[] args) {
    Scanner scanObj = new Scanner(System.in);
    System.out.println("Enter a Number :");
    int intt = scanObj.nextInt();
    for (int i = intt; i > 0; i--) {
        for (int j = intt; j > 0 ; j--) {
            System.out.print(intt);
        }
        intt--;
        System.out.println();

    }
}

}
