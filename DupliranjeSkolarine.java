public class DupliranjeSkolarine {
    public static void main(String[] args) {
        double cijenaSkolarine =5000;
        double duplaCijenaSkolarine = cijenaSkolarine*2;
        final double POVECANJE_SKOLARINE = 1.07;
        int brojGodina =0;

        while (cijenaSkolarine<=duplaCijenaSkolarine){
            brojGodina++;
            cijenaSkolarine *= POVECANJE_SKOLARINE;
        }

        System.out.println(brojGodina);
        }


        }
