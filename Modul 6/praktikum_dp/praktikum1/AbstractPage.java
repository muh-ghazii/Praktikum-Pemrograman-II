package praktikum1;
import java.util.Scanner;

// TEMPLATE METHOD PATTERN (Behavioral)
// ------------------------------------
// Class ini mendefinisikan kerangka (template) alur tampilan halaman
// dalam method final display(). Langkah-langkah utamanya tetap,
// sementara bagian yang bisa berbeda di-delegasikan ke method abstrak
// doContent() dan hook seperti shouldShowFooter() & shouldPauseAfterFooter().
public abstract class AbstractPage implements Page {

    // Judul halaman (akan tampil di bagian atas).
    private final String title;

    protected AbstractPage(String title) {
        this.title = title;
    }

    // =============== TEMPLATE METHOD ===============
    // Inilah method "template"-nya:
    // - final: subclass tidak boleh mengubah urutan langkah.
    // - mengatur urutan header -> title -> konten -> footer -> jeda.
    @Override
    public final String display(AppContext context) {
        // Langkah 1: tampilkan header umum.
        showHeader();

        // Langkah 2: tampilkan judul halaman.
        showTitle();

        // Langkah 3: jalankan konten spesifik halaman.
        //            (primitive operation yang diisi subclass).
        String nextKey = doContent(context);

        // Langkah 4 (opsional): tampilkan footer, jika diizinkan hook.
        if (shouldShowFooter()) {
            showFooter();
        }

        // Langkah 5 (opsional): tampilkan jeda "tekan enter", jika diizinkan hook.
        if (shouldPauseAfterFooter()) {
            prompt(context.getScanner(), defaultPauseMessage());
        }

        // Mengembalikan key halaman berikutnya untuk navigasi.
        return nextKey;
    }

    // =========== PRIMITIVE OPERATION ===========
    // Subclass WAJIB mengimplementasikan method ini.
    // Di sinilah isi konten spesifik tiap halaman ditulis.
    protected abstract String doContent(AppContext context);

    // =============== HOOK METHODS ===============
    // Hook: subclass BOLEH override untuk mematikan/ubah perilaku default.

    // Apakah footer akan ditampilkan setelah konten?
    protected boolean shouldShowFooter() {
        return true; // default: tampilkan footer.
    }

    // Apakah akan ada jeda "tekan Enter..." setelah footer?
    protected boolean shouldPauseAfterFooter() {
        return true; // default: ada jeda.
    }

    // Pesan default untuk jeda.
    protected String defaultPauseMessage() {
        return "Tekan Enter untuk kembali ke menu...";
    }

    // =============== HELPER TAMPILAN BERSAMA ===============

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

    protected String prompt(Scanner scanner, String message) {
        System.out.print(message + " ");
        return scanner.nextLine();
    }
}