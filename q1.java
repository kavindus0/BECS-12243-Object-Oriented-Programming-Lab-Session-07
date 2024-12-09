public class q1 {

    public static void main(String[] args) {
    double[][] temperatures = {
            {36.5, 36.7, 37.1, 36.8, 36.6, 37.0, 36.9},
            {38.2, 37.8, 38.0, 37.0, 37.5, 38.1, 37.6},
            {36.4, 36.3, 36.5, 36.2, 36.6, 36.7, 36.8}
    };
    int patentNo = 1;
        for (double temperatur[]: temperatures) {
            int feverTimes = 0;
            System.out.println();
            for (double eachTemp:temperatur) {
                if (eachTemp>=37.5){
                    feverTimes++;
                }
            }
            if ((feverTimes > 0)) {
                System.out.println("Patient " + patentNo++ + " had a fever " + feverTimes + " times");
            } else {
                System.out.println("patient "+ patentNo++ + " had no fever");
            }

        }

    }
}
