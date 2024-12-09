public class q10 {


    public static void main(String[] args) {
        printRange(5, 5);
        printRange(15, 10);
        printRange(5, 15);
    }

    public static void printRange(int first, int second){
        StringBuffer strNew = new StringBuffer("");

        if (first < second) {
            for (int i = first; i <= second; i++) {
                strNew.append(i);
                strNew.append(" ");
            }
        } else if (first > second) {
            for (int i = first; i >= second; i--) {
                strNew.append(i);
                strNew.append(" ");
            }
        } else {
            strNew.append(first);
        }


        System.out.println(strNew);
    }
}
