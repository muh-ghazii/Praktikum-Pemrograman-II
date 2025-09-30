import java.util.Scanner;

public class PRAK103_2410817310009_MuhammadGhaziRakhmadi {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int n = scan.nextInt();
        int startingNumber = scan.nextInt();

        int count = 0;
        int nowNumber = startingNumber;

        System.out.println("Hasil: ");
        do {
            if (nowNumber % 2 != 0) {
                System.out.print(nowNumber);
                count++;
                if (count < n) {
                    System.out.print(", ");
                }
            }
            nowNumber++;
        } while (count < n);
        System.out.println();
    }
}