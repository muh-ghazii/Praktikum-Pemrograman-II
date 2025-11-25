package praktikum1;
import java.util.Scanner;

// SRP: Mengurus kerangka tampilan halaman (header/title/footer + helper input).
// LSP: Semua subclass AbstractPage bisa diperlakukan sebagai Page.
public abstract class AbstractPage implements Page {

    // SRP: Menyimpan judul untuk kebutuhan tampilan.
    private final String title;

    protected AbstractPage(String title) {
        this.title = title;
    }

    // SRP: Bagian tampilan header yang dapat dipakai ulang oleh semua halaman.
    protected void showHeader() {
        System.out.println("||========================================||");
        System.out.println("||        APLIKASI CLI OOP JAVA           ||");
        System.out.println("||========================================||");
        System.out.println();
    }

    // SRP: Menampilkan judul halaman.
    protected void showTitle() {
        System.out.println("== " + title + " ==");
        System.out.println();
    }

    // SRP: Bagian footer standar setiap halaman.
    protected void showFooter() {
        System.out.println("------------------------------------------");
        System.out.println("|| (c) 2025 | Tugas Pemrograman II      ||");
        System.out.println("||======================================||");
    }

    // SRP: Helper input yang bisa dipakai semua halaman turunan.
    protected String prompt(Scanner scanner, String message) {
        System.out.print(message + " ");
        return scanner.nextLine();
    }

    // OCP: AbstractPage bisa diperluas dengan membuat subclass baru
    //      tanpa mengubah kode di AbstractPage maupun CLIApp.
    // LSP: Subclass tetap memenuhi kontrak Page.display().
    @Override
    public abstract String display(AppContext context);
}