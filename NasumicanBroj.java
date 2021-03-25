/*Napisati program koji generise cijeli, nasumican broj u rasponu od 0 do 10 te pita korisnika da pogodi
koji je broj generisan.*/


import java.util.Scanner;

public class NasumicanBroj {
    public static void main(String[] args) {
        int unosOdKorisnika;
        int nasumicanBroj = (int) (Math.random() * 10);
        System.out.println(nasumicanBroj);

        System.out.println("Unesite neki broj");
        Scanner scanner = new Scanner(System.in);
        unosOdKorisnika = scanner.nextInt();
        while (unosOdKorisnika != nasumicanBroj) {
            if (unosOdKorisnika > nasumicanBroj) {
                System.out.println("Unesite manji broj");
                unosOdKorisnika = scanner.nextInt();
            } else if (unosOdKorisnika < nasumicanBroj) {
                System.out.println("Unesite veci broj");
                unosOdKorisnika = scanner.nextInt();

            }
        }
        System.out.println("Bravo");


    }
}