package praktikum1;
// SRP: Mengurus penampilan data yang sudah di-scan.
public class DisplayDataPage extends AbstractPage {

    public DisplayDataPage() {
        super("FITUR: TAMPILKAN DATA");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        // DIP: Mengambil nilai sharedData lewat AppContext.
        String data = context.getSharedData();

        System.out.println("Data yang tersimpan saat ini:");
        System.out.println("-> " + data);
        System.out.println();

        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        return "MENU";
    }
}