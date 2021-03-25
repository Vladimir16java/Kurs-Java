package com.company;

import java.util.Scanner;

public class ZapreminaRadiusCilindra {
    public static void main(String[] args) {


     System.out.println("Napisati program koji cita radius i duzinu cilindra i izracunava povrsinu i zapreminu ");
     double duzina;
     double radius;
     double povrsina;
     double zapremina;

        System.out.println("Unesite duzinu cilindra");
        Scanner scanner=new Scanner(System.in);
        duzina=scanner.nextDouble();

        System.out.println("Unesite radius cilindra");
        Scanner scanner1=new Scanner(System.in);
        radius=scanner1.nextDouble();

        povrsina=radius*radius*3.14159;
        System.out.println("Povrsina cilindra je:" + povrsina);

        zapremina=povrsina*duzina;
        System.out.println("Zapremina cilindra je:" + zapremina);

        scanner.close();
        scanner1.close();





    }
}
