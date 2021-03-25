import java.util.Scanner;

//Napisati program koji ispisuje sve goidne, 10 po liniji, u rasponu godina koje korisnik unese
public class PrestupneGodine {
    public static void main(String[] args) {
        int pocetnaGodina;
        int krajnaGodina;
        System.out.println("Unsesite pocetnu godinu");
        Scanner scanner=new Scanner(System.in);
        pocetnaGodina=scanner.nextInt();
        System.out.println("Unesite krajnju godinu");
        Scanner scanner1=new Scanner(System.in);
        krajnaGodina=scanner1.nextInt();


        for (int godina=pocetnaGodina; godina<=krajnaGodina; godina++){

            if((godina%4==0 && godina%100 !=0) || (godina%400==0)){
                System.out.print("Prestupna godina:");
                System.out.print(godina+" ");
            }
        }



    }
}