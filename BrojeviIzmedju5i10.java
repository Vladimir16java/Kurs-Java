public class BrojeviIzmedju5i10 {
    public static void main(String[] args) {
        int brojac = 0;

        for (int brojevi = 100; brojevi <= 1000; brojevi++) {
            if (brojevi % 5 == 0 && brojevi % 6 == 0) {
                System.out.print(" " + brojevi);
                brojac++;
                if (brojac % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
