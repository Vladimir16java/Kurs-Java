package com.company;

public class RandomBrojMjesec {
    public static void main(String[] args) {
        System.out.println("Napisati program koji generise nasumicne broj izmedju 1 i 12 i na osnovu nasumicnog broja ispisuje mjesec u godini");

        int nasumicniBroj = (int) (Math.random() * 12) + 1;
        System.out.println(nasumicniBroj);

        if (nasumicniBroj == 1) {
            System.out.println("JAN");
        } else if (nasumicniBroj == 2) {
            System.out.println("FEB");
        } else if (nasumicniBroj == 3) {
            System.out.println("MAR");
        } else if (nasumicniBroj == 4) {
            System.out.println("APR");
        } else if (nasumicniBroj == 5) {
            System.out.println("MAJ");
        } else if (nasumicniBroj == 6) {
            System.out.println("JUN");
        } else if (nasumicniBroj == 7) {
            System.out.println("JUL");
        } else if (nasumicniBroj == 8) {
            System.out.println("AUG");
        } else if (nasumicniBroj == 9) {
            System.out.println("SEP");
        } else if (nasumicniBroj == 10) {
            System.out.println("OKT");
        } else if (nasumicniBroj == 11) {
            System.out.println("NOV");
        } else if (nasumicniBroj == 12) {
            System.out.println("DEC");
        }


    }
}
