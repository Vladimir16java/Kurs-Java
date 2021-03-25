                    //Napisati program koji pita korisnika da unese u funtama

package com.company;

import java.util.Scanner;

public class KonverterFunteKm {

    public static void main(String[] args) {


        double iznosFunti;
        double kursFunte =2.20;
        double iznosKm;


        System.out.println("Unijeti iznos nekoliko funti");
        Scanner scanner=new Scanner(System.in);
        iznosFunti=scanner.nextDouble();


        if ( iznosFunti >0)
        {
            iznosKm=iznosFunti*kursFunte;
            System.out.println("Iznos u km je:" + iznosKm);
        }

        else
            {
            System.out.println("Netacan unos, molimo unesite tacnu vrijednost");
        }

        scanner.close();

        }

    }

