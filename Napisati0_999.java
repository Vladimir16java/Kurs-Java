package com.company;

import java.util.Scanner;

public class Napisati0_999 {
    public static void main(String[] args) {
        System.out.println("Napistati program koji ucitava cijeli broj izmedju o 0 i 999 te sabira sve cifre cijelog broja");

        int unesenibroj;
        int ispis;
        int prvacifra;
        int drugacifra;
        int drugacifra1;
        int trecacifra;

        Scanner scanner=new Scanner(System.in);
        unesenibroj= scanner.nextInt();

        prvacifra= unesenibroj/100;
        drugacifra= unesenibroj/10;
        drugacifra1=drugacifra%10;
        trecacifra= unesenibroj%10;
        ispis=prvacifra+drugacifra1+trecacifra;


        System.out.println(prvacifra);
        System.out.println(drugacifra1);
        System.out.println(trecacifra);
        System.out.println("Zbir cifri je:" + ispis);




    }
}
