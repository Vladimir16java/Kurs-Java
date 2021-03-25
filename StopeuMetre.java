package com.company;

import java.util.Scanner;

public class StopeuMetre {
    public static void main(String[] args) {
        System.out.print("Napisi program koji ucitava broj stopa i konvertuje ih u metre:");

        double stopa;
        double metar;

        Scanner scanner=new Scanner(System.in);
        stopa= scanner.nextDouble();
        metar= stopa*0.305;
        System.out.println("Broj stopa:" + metar);

        scanner.close();

    }
}
