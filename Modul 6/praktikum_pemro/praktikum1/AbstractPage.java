package praktikum1;

import java.util.Scanner;

// OPEN/CLOSED PRINCIPLE (OCP)
// ---------------------------
// Class ini menyediakan kerangka tampilan halaman (header, title, footer,
// dan helper input). Jika ingin menambah halaman baru, kita cukup membuat
// subclass (extends AbstractPage) tanpa mengubah kode di sini.
public abstract class AbstractPage implements Page {

    // Judul halaman yang ditampilkan di bagian atas.
    private final String title;

    protected AbstractPage(String title) {
        this.title = title;
    }

    // Kerangka tampilan bersama (bisa dipakai semua halaman):

    protected void showHeader() {
        System.out.println("||========================================||");
        System.out.println("||        APLIKASI CLI OOP JAVA           ||");
        System.out.println("||========================================||");
        System.out.println();
    }

    protected void showTitle() {
        System.out.println("== " + title + " ==");
        System.out.println();
    }

    protected void showFooter() {
        System.out.println("------------------------------------------");
        System.out.println("|| (c) 2025 | Tugas Pemrograman II      ||");
        System.out.println("||======================================||");
    }

    // Helper untuk membaca input dari user.
    protected String prompt(Scanner scanner, String message) {
        System.out.print(message + " ");
        return scanner.nextLine();
    }

    // Kontrak untuk subclass:
    // setiap halaman wajib mengimplementasikan logika display-nya sendiri.
    // Menambah halaman baru = membuat class baru yang override method ini,
    // tanpa perlu mengedit AbstractPage -> contoh langsung OCP.
    @Override
    public abstract String display(AppContext context);
}