/*Napišite program koji traži od korisnika da unese v u metrima u sekundi (m / s) i
ubrzanje a u metrima / sekundi na kvadrat (m / s2) i prikazuje minimalnu pistu
daljinu.*/


package com.company;

import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        double daljina;
        double brzina;
        double ubrzanje;

        System.out.println("Unesite brzinu");
        Scanner scanner = new Scanner(System.in);
        brzina = scanner.nextDouble();

        System.out.println("Unesite ubrzanje");
        Scanner scanner1 = new Scanner(System.in);
        ubrzanje = scanner1.nextDouble();

        daljina = Math.pow(brzina, 2) / (2 * ubrzanje);

        System.out.println("Daljina iznosi:" + daljina);

    }
}
