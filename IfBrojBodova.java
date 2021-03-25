package com.company;

import java.util.Scanner;

public class IfBrojBodova {
    public static void main(String[] args) {
        System.out.println("Napisati broj bodova i ispisace oscjenu koju je korisink osvojio:");

        int osvojeniBrojBodova;

        Scanner scanner=new Scanner(System.in);
        osvojeniBrojBodova=scanner.nextInt();

        if (osvojeniBrojBodova>100 || osvojeniBrojBodova<0)
        {
            System.out.println("Netacan unos");
        }
        if (osvojeniBrojBodova <=100 && osvojeniBrojBodova >=90)
        {
            System.out.println("Ocjena 10");
        }
        if (osvojeniBrojBodova <=89 && osvojeniBrojBodova >=80)
        {
        System.out.println("Ocjena 9");
        }
        if (osvojeniBrojBodova <=79 && osvojeniBrojBodova >=70)
        {
            System.out.println("Ocjena 8");
        }
        if (osvojeniBrojBodova <=69 && osvojeniBrojBodova >=60)
        {
            System.out.println("Ocjena 7");
        }
        if (osvojeniBrojBodova <=59 && osvojeniBrojBodova >=50)
        {
            System.out.println("Ocjena 6");
        }
        if (osvojeniBrojBodova<50 && osvojeniBrojBodova >=0)
        {
            System.out.println("Niste polozili");
        }
    }
}
