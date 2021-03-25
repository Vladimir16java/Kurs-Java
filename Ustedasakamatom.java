package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ustedasakamatom {

    public static void main(String[] args) {
        System.out.println("Prepostavimo da ustedimo 100$ svaki mjesec na svoj racun sa godisnjom kamatom od 5%.");

        double mjesecnaKamtnaStopa=0.00417;
        double unoscifreMjesecno;
        double prviMjesec;
        double drugimjesec;
        double trecimjesec;
        double cetvrtimjesec;
        double petimjesec;
        double sestimjesec;

        Scanner scanner=new Scanner(System.in);
        unoscifreMjesecno= scanner.nextDouble();

        //prvi mjesec
        prviMjesec= unoscifreMjesecno * (1+mjesecnaKamtnaStopa);
        System.out.println("Ustedjevina prvi mjesec:" + prviMjesec);

        //drugi mjesec
        drugimjesec= (unoscifreMjesecno + prviMjesec)*(1+mjesecnaKamtnaStopa);
        System.out.println("Ustedjevina drugi mjesec:" + drugimjesec);

        //treci mjesec
        trecimjesec=(unoscifreMjesecno + drugimjesec)+(1+mjesecnaKamtnaStopa);
        System.out.println("Ustedjevina treci mjesec:" + trecimjesec);


        //cetvrti mjesec
        cetvrtimjesec=(unoscifreMjesecno + trecimjesec)+(1+mjesecnaKamtnaStopa);
        System.out.println("Ustedjevina cetvrti mjesec:" + cetvrtimjesec);


        //peti mjesec
        petimjesec=(unoscifreMjesecno + cetvrtimjesec)+(1+mjesecnaKamtnaStopa);
        System.out.println("Ustedjevina peti mjesec:" + petimjesec);


        //sesti mjesec
        sestimjesec=(unoscifreMjesecno + petimjesec)+(1+mjesecnaKamtnaStopa);
        System.out.println("Ustedjevina sesti mjesec:" + sestimjesec);


        scanner.close();
    }
}
