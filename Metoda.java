// Metoda_ kolekcija izjava


public class Metoda {
    public static int sumaBrojeva(int pocetniBroj, int zavrsniBroj){
        int suma=0;
        for (int i=pocetniBroj; i<zavrsniBroj; i++)
            suma+= i;
        return suma;
    }
    public static void main(String[] args) {
        System.out.println(sumaBrojeva(10,78));
    }
}
