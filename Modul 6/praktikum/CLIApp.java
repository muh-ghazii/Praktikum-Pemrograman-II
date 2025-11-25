import praktikum1.*;
import java.util.Map;

// SRP: Mengatur lifecycle aplikasi dan navigasi antar halaman.
// DIP: Bergantung pada abstraksi Page dan AppContext yang disuntikkan.
// OCP: Penambahan halaman baru cukup tambahkan di Map tanpa ubah logika start().
public class CLIApp {

    private final AppContext context;

    // DIP: Menyimpan halaman dalam bentuk abstraksi Page.
    private final Map<String, Page> pages;

    // State navigasi.
    private String currentPageKey;
    private boolean isRunning;

    // DIP: context dan pages disuntikkan dari luar (constructor injection),
    //      bukan di-new di dalam CLIApp.
    public CLIApp(AppContext context, Map<String, Page> pages) {
        this.context = context;
        this.pages = pages;
        this.currentPageKey = "MENU";
        this.isRunning = true;
    }

    // SRP: Mengelola loop utama aplikasi.
    public void start() {
        try {
            while (isRunning) {
                clearScreen();

                // LSP: pages.get(...) mengembalikan implementasi Page apapun.
                Page page = pages.get(currentPageKey);
                if (page == null) {
                    System.out.println("Halaman tidak ditemukan: " + currentPageKey);
                    break;
                }

                // ISP: Page hanya butuh implement 1 method: display(context).
                String nextKey = page.display(context);

                if ("EXIT".equalsIgnoreCase(nextKey)) {
                    isRunning = false;
                } else {
                    // OCP: Untuk mendukung halaman baru, cukup pastikan ada key baru di Map.
                    currentPageKey = nextKey;
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // SRP: Menutup resource aplikasi lewat context.
            context.close();
            System.out.println("Terima kasih telah menggunakan aplikasi!");
        }
    }

    private void clearScreen() {
        // SRP: Hanya untuk merapikan tampilan console.
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}