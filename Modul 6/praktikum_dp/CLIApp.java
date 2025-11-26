import praktikum1.*;
// FACADE PATTERN (Structural)
// ---------------------------
// Class ini bertindak sebagai Facade yang MENYEDERHANAKAN akses ke
// beberapa subsistem:
//  - AppContext  (state & input aplikasi)
//  - PageFactory (pembuatan objek Page)
//  - Page        (berbagai halaman UI)
//
// Dari sudut pandang client (class Main), cukup membuat CLIApp dan
// memanggil app.start() tanpa perlu tahu detail pembuatan halaman
// dan navigasi internal.
public class CLIApp {

    // Subsistem: konteks aplikasi (Scanner, data, todo list, dll.).
    private final AppContext context;

    // Subsistem: Factory untuk membuat halaman berdasarkan key.
    private final PageFactory pageFactory;

    // State navigasi aplikasi.
    private String currentPageKey;
    private boolean isRunning;

    // Dependency Injection:
    // Facade menerima objek AppContext dan PageFactory dari luar.
    public CLIApp(AppContext context, PageFactory pageFactory) {
        this.context = context;
        this.pageFactory = pageFactory;
        this.currentPageKey = "MENU";
        this.isRunning = true;
    }

    // Method sederhana yang menjadi "pintu masuk" utama ke seluruh sistem.
    // Inilah peran utama Facade: satu method untuk menjalankan sistem yang kompleks.
    public void start() {
        try {
            while (isRunning) {
                clearScreen();

                // Menggunakan Factory Method:
                // meminta Page yang sesuai key saat ini ke PageFactory,
                // tanpa tahu detail implementasi halaman.
                Page page = pageFactory.createPage(currentPageKey);
                if (page == null) {
                    System.out.println("Halaman tidak ditemukan: " + currentPageKey);
                    break;
                }

                // Menjalankan halaman:
                // Di belakang layar, jika halaman extends AbstractPage,
                // maka Template Method display() akan mengatur alur tampilan.
                String nextKey = page.display(context);

                // Navigasi: jika user memilih keluar, hentikan loop.
                if ("EXIT".equalsIgnoreCase(nextKey)) {
                    isRunning = false;
                } else {
                    // Jika tidak keluar, pindah ke halaman berikutnya.
                    currentPageKey = nextKey;
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Menutup resource context saat aplikasi selesai.
            context.close();
            System.out.println("Terima kasih telah menggunakan aplikasi!");
        }
    }

    // Helper sederhana untuk merapikan tampilan console.
    private void clearScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}