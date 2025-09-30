import java.util.Scanner;

public class PRAK104_2410817310009_MuhammadGhaziRakhmadi {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tangan Abu: ");
        String tanganAbu = scan.nextLine().replace(" ", "");

        System.out.println("Tangan Bagas: ");
        String tanganBagas = scan.nextLine().replace(" ", "");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            char abu = tanganAbu.charAt(i);
            char bagas = tanganBagas.charAt(i);

            if (abu == bagas) {

            } else if ((abu == 'B' && bagas == 'G') ||
                    (abu == 'G' && bagas == 'K') ||
                    (abu == 'K' && bagas == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        System.out.println ("Pemenang: ");
        if (poinAbu > poinBagas) {
            System.out.print("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.print ("Bagas");
        } else {
            System.out.print("Seri");
        }
    }
}