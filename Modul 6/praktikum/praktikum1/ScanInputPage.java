package praktikum1;
// SRP: Mengurus fitur scan input dan menyimpan ke sharedData.
public class ScanInputPage extends AbstractPage {

    public ScanInputPage() {
        super("FITUR: SCAN INPUT");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        // DIP: Menggunakan Scanner dari AppContext, bukan membuat sendiri.
        String input = prompt(context.getScanner(), "Masukkan data baru:");

        // SRP: Menyimpan hasil input ke sharedData melalui context.
        context.setSharedData(input);

        System.out.println();
        System.out.println("Data berhasil disimpan!");

        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        // LSP/OCP: Mengembalikan string "MENU" sebagai kode halaman generik.
        return "MENU";
    }
}