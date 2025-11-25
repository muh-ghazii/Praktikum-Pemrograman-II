import page.*;
import java.util.HashMap;
import java.util.Map;

public class CLIApp {

    private final AppContext context;
    private final Map<String, Page> pages;

    private String currentPageKey;
    private boolean isRunning;

    public CLIApp() {
        this.context = new AppContext();
        this.pages = new HashMap<>();

        this.pages.put("MENU", new MainMenuPage());
        this.pages.put("SCAN", new ScanInputPage());
        this.pages.put("DISPLAY", new DisplayDataPage());
        this.pages.put("ADD_TODO", new AddTodoPage());
        this.pages.put("VIEW_TODOS", new ViewTodoPage());

        this.currentPageKey = "MENU";
        this.isRunning = true;
    }

    public void start() {
        try {
            while (isRunning) {
                clearScreen();

                Page currentPage = pages.get(currentPageKey);
                String nextKey = currentPage.display(context);

                if (nextKey.equals("EXIT")) {
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