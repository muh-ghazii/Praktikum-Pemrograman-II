package praktikum1;

// SRP: Mengurus tampilan dan logika menu utama saja.
// LSP: Bisa dipakai sebagai Page di CLIApp.
public class MainMenuPage extends AbstractPage {

    public MainMenuPage() {
        super("MENU UTAMA"); // SRP: judul khusus halaman ini.
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        System.out.println("1. Scan Input Pengguna");
        System.out.println("2. Tampilkan Input Tersimpan");
        System.out.println("3. Tambah Todo");
        System.out.println("4. Lihat Semua Todo");
        System.out.println("0. Keluar");
        System.out.println();

        // ISP: Interaksi input sederhana dan spesifik.
        String choice = prompt(context.getScanner(), "Pilih menu:");
        System.out.println();

        // SRP: Mapping pilihan user -> kode halaman berikutnya.
        switch (choice) {
            case "1":
                return "SCAN";       // OCP: key ini bisa diarahkan ke Page baru lewat konfigurasi di Main.
            case "2":
                return "DISPLAY";
            case "3":
                return "ADD_TODO";
            case "4":
                return "VIEW_TODOS";
            case "0":
                return "EXIT";
            default:
                System.out.println("Pilihan tidak valid, coba lagi.");
                return "MENU";
        }
    }
}