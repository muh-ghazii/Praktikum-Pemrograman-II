package praktikum1;

// Concrete Creator untuk Factory Method.
public class SimplePageFactory implements PageFactory {

    @Override
    public Page createPage(String key) {
        // Factory Method: logika pemilihan class Page berdasarkan key.
        switch (key) {
            case "MENU":       return new MainMenuPage();
            case "SCAN":       return new ScanInputPage();
            case "DISPLAY":    return new DisplayDataPage();
            case "ADD_TODO":   return new AddTodoPage();
            case "VIEW_TODOS": return new ViewTodoPage();
            default:
                return new MainMenuPage(); // fallback
        }
    }
}