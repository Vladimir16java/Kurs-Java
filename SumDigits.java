public class SumDigits {

public static int sumDigits(long number){
    long suma=0;
    while(number>0){
        long posljednjaCifra =number%10;
        suma+=posljednjaCifra;
        number=number/10;
    }

    return (int)suma;

}

    public static void main(String[] args) {
        System.out.println(sumDigits(521));
    }
}
