/*Napišite program koji od korisnika traži da unese početnu brzinu v0 u metrima/sekundi
  drugo, krajnja brzina v1 u metrima/sekundi, a vremenski raspon t u sekundama,
                                                i prikazuje prosječno ubrzanje. */


package com.company;

import java.util.Scanner;

public class ProsjecnaBrzina {

    public static void main(String[] args) {
        double V0;
        double V1;
        double t;
        double a;

        System.out.println("Unesite pocetnu brzinu");
        Scanner scanner = new Scanner(System.in);
        V0 = scanner.nextDouble();

        System.out.println("Unesite krajnu brzinu");
        Scanner scanner1 = new Scanner(System.in);
        V1 = scanner1.nextDouble();

        System.out.println("Unesite vrijeme");
        Scanner scanner2 = new Scanner(System.in);
        t = scanner2.nextDouble();

        if (V1 > V0) {

            a = ((V1 - V0) / t);

            System.out.println("Prosjecna ubrzanje je " + a);
        } else {
            System.out.println("Pocetne brzina ne moze biti manja od krajnje brzine, molimo pokusaj te ponovo.");
        }


    }
}
