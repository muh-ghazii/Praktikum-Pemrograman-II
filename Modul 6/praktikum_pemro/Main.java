import praktikum1.*;
import java.util.HashMap;
import java.util.Map;

// SRP: Entry point & composition root (menyusun dependency).
// DIP: Implementasi konkret dibuat di sini lalu disuntikkan ke CLIApp.
public class Main {
    public static void main(String[] args) {
        // DIP: Satu AppContext untuk seluruh aplikasi.
        AppContext context = new AppContext();

        // OCP: Menambah halaman baru cukup tambah entry di Map ini.
        Map<String, Page> pages = new HashMap<>();
        pages.put("MENU", new MainMenuPage());
        pages.put("SCAN", new ScanInputPage());
        pages.put("DISPLAY", new DisplayDataPage());
        pages.put("ADD_TODO", new AddTodoPage());
        pages.put("VIEW_TODOS", new ViewTodoPage());

        // DIP: CLIApp hanya tahu bahwa ia menerima Map<String, Page>.
        CLIApp app = new CLIApp(context, pages);
        app.start();
    }
}1