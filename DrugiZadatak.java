import java.util.Scanner;

public class DrugiZadatak{
    public static void main(String[] args) {
        double kursPounda = 2.20;
        double rezultat=0;
        double kilogrami=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite vrijednost kilograma");
        kilogrami= scanner.nextDouble();
        rezultat=kilogrami* kursPounda;
        System.out.println("Odgovara vrijednost od:" + rezultat);


    }


}
