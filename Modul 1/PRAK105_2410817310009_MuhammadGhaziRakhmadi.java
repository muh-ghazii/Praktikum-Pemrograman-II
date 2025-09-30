import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2410817310009_MuhammadGhaziRakhmadi {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double radius = scan.nextDouble();

        System.out.print("Masukkan Tinggi: ");
        double tubeHeight = scan.nextDouble();

        double volume = PI * radius * radius * tubeHeight;

        System.out.println("Hasil: ");
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", radius, tubeHeight, volume);

        scan.close();
    }
}