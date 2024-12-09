import java.time.LocalTime;
public class q8 {
    public static void main(String[] args) {
dateGreetMethod();
    }

    static void dateGreetMethod(){
        LocalTime myObj = LocalTime.now();
        if (myObj.getHour()<12){
            System.out.println("Good Morning");
        } else if (myObj.getHour() > 12 && myObj.getHour() <16) {
            System.out.println("Good Afternoon");
        }
        else if (myObj.getHour() > 16 && myObj.getHour() <18) {
            System.out.println("Good Evening");
        }
        else if (myObj.getHour() > 18 && myObj.getHour() <24) {
            System.out.println("Good Night");
        }
        else {
            System.out.println("Internal Error");
        }
    }
}
