import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Enter a radius of a circle: ");
        double radii = scanObj.nextDouble();
        System.out.printf("Area of Circle is %.2f \n",Area(radii));
        System.out.printf("Circumference of Circle is %.2f \n",Circum(radii));
    }
    public static double Area(double radii){
        return Math.PI*radii*radii;
    }
    public static double Circum(double radii){
        return 2*Math.PI*radii;
    }
}
