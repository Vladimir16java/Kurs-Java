/*Napisati program koji pita korisnika da unosi cijele brojeve sve dok korisnik ne unese 0, kada korisnik unese nulu,
program ispisuje zbir svih unesenih brojeva, prosjek svih unesenih brojeva te zavrsava sa radom.
 */


import java.util.Scanner;

public class Petlje {
    public static void main(String[] args) {
        int unosBrojeva = -1;
        int zbir = 0;
        double prosjek = 0;
        int brojac = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite cijele brojeve....");


        while (unosBrojeva != 0) {
            unosBrojeva = scanner.nextInt();
            zbir += unosBrojeva;
            brojac++;
        }
        System.out.println("Zbir unesenih brojeva:" + zbir);
        prosjek = (double) zbir / brojac;
        System.out.println("Prosjek:" + prosjek);
    }

}
