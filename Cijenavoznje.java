package com.company;

import java.util.Scanner;

/* predjeni put 325.0
   potrosnja 8.5l
   cijena goriva 1.95
 */

public class Cijenavoznje {
    public static void main(String[] args) {
        double distanca;
        double potrosnja;
        double cijenapolitri;
        double ukupnacijena;


        System.out.println("Unijeti distancu");
        Scanner scanner = new Scanner(System.in);
        distanca = scanner.nextDouble();

        System.out.println("Unijeti potrosnja");
        Scanner scanner1 = new Scanner(System.in);
        potrosnja = scanner.nextDouble();

        System.out.println("Unijeti cijenu po litri");
        Scanner scanner2 = new Scanner(System.in);
        cijenapolitri = scanner.nextDouble();

        ukupnacijena = ((distanca / 100) * 8.5) * cijenapolitri;
        System.out.println("Ukupna cijena putovanja:" + ukupnacijena);


    }
}
