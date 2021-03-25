//Od korisnika da unese neki broj izmedju  i 7
// pararelno tome ispisi dan u sedmici

package com.company;

import java.util.Scanner;

public class PrekidacSwich {
    public static void main(String[] args) {
        int dan;

        System.out.println("Unesite jedan broj od 1 do 7");

        Scanner scanner = new Scanner(System.in);
        dan = scanner.nextInt();

        switch (dan) {
            case 1: {
                System.out.println("Ponedjeljak");
                break;
            }
            case 2: {
                System.out.println("Utorak");
                break;
            }
            case 3: {
                System.out.println("Srijeda");
                break;
            }
            case 4: {
                System.out.println("Cetvrtak");
                break;
            }
            case 5: {
                System.out.println("Petak");
                break;
            }
            case 6: {
                System.out.println("Subota");
                break;
            }
            case 7: {
                System.out.println("Nedjelja");
                break;
            }
            default: {
                System.out.println("Nije unesen dobar broj");

            }
        }
    }
}