package praktikum1;
// LISKOV SUBSTITUTION PRINCIPLE (LSP)
// -----------------------------------
// ScanInputPage adalah salah satu implementasi Page.
// Di dalam CLIApp, objek ini diperlakukan sebagai Page (tipe abstrak).
// Ia bisa menggantikan implementasi Page lain (ViewTodoPage, dsb.)
// tanpa mengubah perilaku yang diharapkan klien (CLIApp).
public class ScanInputPage extends AbstractPage {

    public ScanInputPage() {
        super("FITUR: SCAN INPUT");
    }

    @Override
    public String display(AppContext context) {
        // Dari sudut pandang CLIApp, ia hanya memanggil page.display(context)
        // dan mengharapkan sebuah String key halaman berikutnya.
        // ScanInputPage memenuhi kontrak tersebut dengan benar.

        showHeader();
        showTitle();

        // Mengambil input dari user.
        String input = prompt(context.getScanner(), "Masukkan data baru:");

        // Menyimpan input ke sharedData di context.
        context.setSharedData(input);

        System.out.println();
        System.out.println("Data berhasil disimpan!");
        System.out.println();

        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        // Mengembalikan key halaman berikutnya (MENU), sesuai pola Page lain.
        return "MENU";
    }
}