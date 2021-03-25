package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Celsius2Ferenhaitima {

    public static void main(String[] args) {
	   double temperaturastepeni;
	   double temperaturaferenhaiti;

        System.out.print("Unijeti temperaturu u Celzijusima a program ce ispisati u ferenhaitima");

        Scanner scanner = new Scanner(System.in);
        temperaturastepeni= scanner.nextDouble();
        temperaturaferenhaiti=(9.0/5.0*temperaturastepeni+32);
        System.out.println("Temperatura u ferenhaitima " + temperaturaferenhaiti);




        
        
        
        
    }
}
