import java.util.Scanner;

public class Klasee {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Unijeti cijeli broj");
        int unosBroj=scanner.nextInt();

        for (int broj=1; broj<=unosBroj; broj++){
            if (broj%13==0){
                System.out.print(broj + " ");

        }

        }

    }
}
