/*Napišite program koji izračunava potrebnu energiju
za zagrijavanje vode od početne do konačne temperature. Vaš program
treba zatražiti od korisnika da unese količinu vode u kilogramima i početnu vrijednost
i konačne temperature vode.*/


package com.company;

import java.util.Scanner;

public class ZagrijavanjeVode {
    public static void main(String[] args) {
        double potrebneEnergija;
        double kolicinaVode;
        double zadanaTemperatura;
        double pocetnaTemperaturaVode;

        System.out.println("Unesite kolicinu vode u kilogramima");
        Scanner scanner = new Scanner(System.in);
        kolicinaVode = scanner.nextDouble();

        System.out.println("Unesite pocetnu tempearaturu vode");
        Scanner scanner1 = new Scanner(System.in);
        pocetnaTemperaturaVode = scanner1.nextDouble();

        System.out.println("Unesite konacnu zadanu temperaturu vode");
        Scanner scanner2 = new Scanner(System.in);
        zadanaTemperatura = scanner2.nextDouble();

        potrebneEnergija = kolicinaVode * (zadanaTemperatura - pocetnaTemperaturaVode) * 4184;
        System.out.println("Potrebna energija iznosi: " + potrebneEnergija + "J");


    }
}
