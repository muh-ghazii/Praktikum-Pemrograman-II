import praktikum1.*;

// SRP: entry point & composition root.
// Pattern: memakai Facade (CLIApp)
public class Main {
    public static void main(String[] args) {
        AppContext context = new AppContext();

        // Creational Pattern: Factory Method (melalui SimplePageFactory).
        PageFactory factory = new SimplePageFactory();

        // Structural Pattern: Facade = CLIApp.
        CLIApp app = new CLIApp(context, factory);
        app.start();
    }
}