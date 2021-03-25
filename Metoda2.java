public class Metoda2 {
    public static void ispisOcjene(double brojBodova){
     if (brojBodova>50){
         System.out.println("Ocjena je 7");
     }
        else if (brojBodova>70){
            System.out.println("Ocjena je 8");
        }
        else if (brojBodova>80){
            System.out.println("Ocjena je 9");
        }
    }

    public static void main(String[] args) {
        ispisOcjene(65.9);
    }
}
