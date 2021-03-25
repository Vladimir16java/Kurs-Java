//Броји позитивне и негативне бројеве и израчунај просек бројева) Напиши
//програм који чита неодређени број целих бројева, одређује колико
//позитивне и негативне вредности су прочитане и израчунава укупан и просек од
//улазне вредности (не рачунајући нуле). Ваш програм се завршава са уносом 0. Приказ
//просек као број са покретном зарезом.

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        int unos;
        int zbir = 0;
        int prosjek = 0;
        int brojacPozitivnih = 0;
        int brojacNegativnih = 0;

        System.out.println("Unesite nekakve brojeve a program ce izracunati prosjek");
        Scanner scanner = new Scanner(System.in);
        unos = scanner.nextInt();
        while (unos != 0) {
            if (unos > 0) {
                System.out.println("Unesite opet broj");
                brojacPozitivnih++;
                unos = scanner.nextInt();

            } else if (unos < 0) {
                System.out.println("Unesite opet broj");
                brojacNegativnih++;
                unos = scanner.nextInt();
            }
            zbir += unos;
        }
        System.out.println("Broj pozitivnih je: " + brojacPozitivnih);
        System.out.println("Broj negativnih je: " + brojacNegativnih);
        System.out.println("Zbir unesenih brojeva je: " + zbir);
        prosjek = zbir / (brojacNegativnih + brojacPozitivnih);
        System.out.println("Prosjek je: " + prosjek);


    }
}