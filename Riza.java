package com.company;

import java.util.Scanner;

public class Riza {
    public static void main(String[] args) {
        double prvoPakovanjeTezina;
        double prvoPakovanjeCijena;
        double drugoPakovanjeTezina;
        double drugoPakovanjeCijena;
        double cijenaPrvogPakovanjaPoKG;
        double cijenaDrugogPakovanjaPoKG;

        System.out.println("Unesite tezinu prvog pakovanja");
        Scanner scanner = new Scanner(System.in);
        prvoPakovanjeCijena = scanner.nextDouble();

        System.out.println("Unesite cijenu prvog pakovanja");
        Scanner scanner1 = new Scanner(System.in);
        prvoPakovanjeTezina = scanner1.nextDouble();

        System.out.println("Unesite tezinu drugog pakovanja");
        Scanner scanner2 = new Scanner(System.in);
        drugoPakovanjeTezina = scanner2.nextDouble();

        System.out.println("Unesite cijenu drugog pakovanja");
        Scanner scanner3 = new Scanner(System.in);
        drugoPakovanjeCijena = scanner3.nextDouble();



        cijenaPrvogPakovanjaPoKG=  prvoPakovanjeCijena/ prvoPakovanjeTezina ;
        cijenaDrugogPakovanjaPoKG = drugoPakovanjeCijena / drugoPakovanjeTezina;

        if(cijenaPrvogPakovanjaPoKG > cijenaDrugogPakovanjaPoKG) {
            System.out.println("Bolja opcija je pakovanje broj dva");
        }
        else {
            System.out.println("Bolja opcija je pakovanje broj jedan");
        }

        System.out.println("Cijena po kilogramu prvog Pakovanja: " + cijenaPrvogPakovanjaPoKG);
        System.out.println("Cijena po kilogramu drugog pakovanja: " + cijenaDrugogPakovanjaPoKG);




        scanner.close();
        scanner1.close();
        scanner2.close();
        scanner3.close();




    }
}
