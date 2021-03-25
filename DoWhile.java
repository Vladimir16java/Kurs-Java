
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 101) + 1;
        int random2 = (int) (Math.random() * 101) + 1;
        int razlika;
        int unos;


        Scanner scanner = new Scanner(System.in);
        System.out.println(random1);
        System.out.println(random2);
        if (random1 > random2) {
            System.out.print("Koliko je " + random1 + " - " + random2 + " = ");
            razlika = random1 - random2;
        } else {
            System.out.print("Koliko je " + random2 + " - " + random1 + " = ");
            razlika = random2 - random1;
        }
        unos = scanner.nextInt();

        while (unos != razlika) {
            System.out.println("Pogresan");
            System.out.println("Molimo unesite ponovo");
            if (random1 > random2) {
                System.out.print("Koliko je " + random1 + " - " + random2 + " = ");

            } else {
                System.out.print("Koliko je " + random2 + " - " + random1 + " = ");
            }

            unos = scanner.nextInt();

        }
        System.out.println("Rezultat je tacan.");
        scanner.close();
    }
}
