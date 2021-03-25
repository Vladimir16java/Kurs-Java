package com.company;

import java.util.Scanner;

public class RandomSabiranje {

    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 101) + 1;
        int random2 = (int) (Math.random() * 101) + 1;
        int zbir;
        int unos;


        System.out.print("Koliko je " + random1 + " + " + random2 + " = ");
        zbir = random1 + random2;

        Scanner scanner = new Scanner(System.in);
        unos = scanner.nextInt();

        if (unos == zbir) {
            System.out.println("Odgovor koji ste unijeli je tacan.");
        } else {
            System.out.println("Netacan odgovor, tacan odgovor je " + zbir);
        }

        scanner.close();








    }
}
