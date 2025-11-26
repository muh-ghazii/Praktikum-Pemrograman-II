import praktikum1.*;
import java.util.Map;

// DEPENDENCY INVERSION PRINCIPLE (DIP)
// ------------------------------------
// CLIApp adalah modul level tinggi yang mengelola lifecycle aplikasi.
// Ia tidak membuat sendiri halaman konkret, tetapi bergantung pada
// abstraksi Page yang disuntikkan melalui Map<String, Page> dari luar.
public class CLIApp {

    // Context berisi resource & data bersama aplikasi.
    private final AppContext context;

    // Peta key -> Page, berisi implementasi halaman yang disediakan dari luar.
    private final Map<String, Page> pages;

    // State navigasi.
    private String currentPageKey;
    private boolean isRunning;

    // Konstruktor menerima dependency dari luar (constructor injection).
    // Ini membuat CLIApp bergantung pada abstraksi Page dan struktur Map,
    // bukan pada kelas-kelas halaman konkret (MainMenuPage, dst.) secara langsung.
    public CLIApp(AppContext context, Map<String, Page> pages) {
        this.context = context;
        this.pages = pages;
        this.currentPageKey = "MENU";
        this.isRunning = true;
    }

    // Method utama untuk menjalankan aplikasi CLI.
    public void start() {
        try {
            while (isRunning) {
                clearScreen();

                // CLIApp hanya tahu bahwa ia mengambil Page dari map
                // berdasarkan currentPageKey. Implementasi halamannya bisa apa saja
                // selama mengimplementasikan interface Page.
                Page page = pages.get(currentPageKey);
                if (page == null) {
                    System.out.println("Halaman tidak ditemukan: " + currentPageKey);
                    break;
                }

                // Memanggil perilaku abstrak Page: display(context).
                String nextKey = page.display(context);

                // Navigasi berdasarkan key yang dikembalikan halaman.
                if ("EXIT".equalsIgnoreCase(nextKey)) {
                    isRunning = false;
                } else {
                    currentPageKey = nextKey;
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Menutup resource yang dikelola context.
            context.close();
            System.out.println("Terima kasih telah menggunakan aplikasi!");
        }
    }

    // Hanya untuk merapikan tampilan console.
    private void clearScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}