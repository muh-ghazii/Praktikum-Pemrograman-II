import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class PRAK101_2410817310009_MuhammadGhaziRakhmadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String bornPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int date = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int month = input.nextInt();
        String nameMonth = switch (month)
        {
            case 1 -> "Januari";
            case 2 ->"Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan tidak valid";
        };

        System.out.print("Masukkan Tahun Lahir: ");
        int year = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();
        if (height <= 0) {
            System.out.print("Tidak bisa!");
        }

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();
            if (weight <= 0) {
                System.out.print("Tidak bisa!");
            };

        System.out.println("Nama Lengkap " + name + ", Lahir di " + bornPlace + " pada Tanggal " + date + " " + nameMonth + " " + year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}