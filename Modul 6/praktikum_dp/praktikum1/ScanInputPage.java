package praktikum1;

// SRP: scan input & simpan.
// Design Pattern: implementasi doContent() pada Template Method.
public class ScanInputPage extends AbstractPage {

    public ScanInputPage() {
        super("FITUR: SCAN INPUT");
    }

    @Override
    protected String doContent(AppContext context) {
        String input = prompt(context.getScanner(), "Masukkan data baru:");
        context.setSharedData(input);

        System.out.println();
        System.out.println("Data berhasil disimpan!");
        System.out.println();

        return "MENU";
    }
}
