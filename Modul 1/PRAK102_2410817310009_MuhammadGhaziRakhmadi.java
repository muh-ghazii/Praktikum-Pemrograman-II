import java.util.Scanner;

public class PRAK102_2410817310009_MuhammadGhaziRakhmadi {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Angka: ");
        int startingNumber = input.nextInt();

        int i = 0;
        int numberNow = startingNumber;

        System.out.println("Output");
        while (i < 10) {
            if (numberNow % 5 == 0) {
                int result = (numberNow / 5) -1;
                        System.out.print(result);
            } else {
                System.out.print(numberNow);
            } if (i < 9) {
                System.out.print(", ");
            }
            numberNow++;
            i++;
        }
        System.out.println();
    }
}