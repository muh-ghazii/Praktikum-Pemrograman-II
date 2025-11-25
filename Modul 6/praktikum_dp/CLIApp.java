import praktikum1.*;

// Design Pattern (Structural): FACADE
// - CLIApp menyederhanakan penggunaan seluruh subsistem
//   (AppContext, PageFactory, dan Page) lewat satu method: start().
//
// Juga menggunakan:
// - Factory Method (PageFactory.createPage())
// - Template Method (AbstractPage.display() yang dipanggil via page.display()).
public class CLIApp {

    private final AppContext context;
    private final PageFactory pageFactory;

    private String currentPageKey;
    private boolean isRunning;

    // DIP: dependency context & factory disuntikkan dari luar.
    public CLIApp(AppContext context, PageFactory pageFactory) {
        this.context = context;
        this.pageFactory = pageFactory;
        this.currentPageKey = "MENU";
        this.isRunning = true;
    }

    // Facade: method sederhana untuk menjalankan aplikasi.
    public void start() {
        try {
            while (isRunning) {
                clearScreen();

                // Factory Method: minta objek Page ke PageFactory.
                Page page = pageFactory.createPage(currentPageKey);
                if (page == null) {
                    System.out.println("Halaman tidak ditemukan: " + currentPageKey);
                    break;
                }

                // Template Method: display() mengatur alur tampilan halaman.
                String nextKey = page.display(context);

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
            context.close();
            System.out.println("Terima kasih telah menggunakan aplikasi!");
        }
    }

    private void clearScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}
