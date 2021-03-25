package com.company;


import java.util.Scanner;

public class PDV {
    public static void main(String[] args) {

        // 0 algoritam
        // obavjestiti korisnika da unese neku sumu
        // trebamo uzeti podatak iz konzole
        // izracunati
        // ispisati rezultat


        System.out.println("Unesite nekakvu sumu");
        Scanner scanner = new Scanner(System.in);

        double unesenavrijednost = scanner.nextDouble();
        double rezultat= unesenavrijednost * 1.17;

        System.out.println("Iznos sa pdv"+ rezultat);


    }
}
