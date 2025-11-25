package praktikum1;

// SRP: menu utama.
// Design Pattern: subclass dari Template Method di AbstractPage.
public class MainMenuPage extends AbstractPage {

    public MainMenuPage() {
        super("MENU UTAMA");
    }

    // Primitive operation Template Method.
    @Override
    protected String doContent(AppContext context) {
        System.out.println("1. Scan Input Pengguna");
        System.out.println("2. Tampilkan Input Tersimpan");
        System.out.println("3. Tambah Todo");
        System.out.println("4. Lihat Semua Todo");
        System.out.println("0. Keluar");
        System.out.println();

        String choice = prompt(context.getScanner(), "Pilih menu:");
        System.out.println();

        switch (choice) {
            case "1": return "SCAN";
            case "2": return "DISPLAY";
            case "3": return "ADD_TODO";
            case "4": return "VIEW_TODOS";
            case "0": return "EXIT";
            default:
                System.out.println("Pilihan tidak valid, coba lagi.");
                return "MENU";
        }
    }

    // Hook: matikan footer & jeda di menu utama.
    @Override
    protected boolean shouldShowFooter() {
        return false;
    }

    @Override
    protected boolean shouldPauseAfterFooter() {
        return false;
    }
}
