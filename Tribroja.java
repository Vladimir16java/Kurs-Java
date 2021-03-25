package com.company;

import java.util.Scanner;

public class Tribroja {
    public static void main(String[] args) {

        System.out.println("Unijeti broj sekundi");
        Scanner scanner= new Scanner(System.in);

        int unos = scanner.nextInt();
        int minute = unos / 60;
        int sekunde = unos % 60;

        System.out.println("Minute"+ minute);
        System.out.println("sekunde"+ sekunde);





    }

}
