package praktikum1;
import java.util.Scanner;
// SRP: kerangka tampilan halaman.
// Design Pattern (Behavioral): TEMPLATE METHOD
// - display() final berisi alur tetap.
// - Subclass mengisi doContent() 
public abstract class AbstractPage implements Page {

    private final String title;

    protected AbstractPage(String title) {
        this.title = title;
    }

    @Override
    public final String display(AppContext context) {
        showHeader();
        showTitle();

        String nextKey = doContent(context);

        if (shouldShowFooter()) {
            showFooter();
        }

        if (shouldPauseAfterFooter()) {
            prompt(context.getScanner(), defaultPauseMessage());
        }

        return nextKey;
    }

    protected abstract String doContent(AppContext context);
    protected boolean shouldShowFooter() {
        return true;
    }

    protected boolean shouldPauseAfterFooter() {
        return true;
    }

    protected String defaultPauseMessage() {
        return "Tekan Enter untuk kembali ke menu...";
    }

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