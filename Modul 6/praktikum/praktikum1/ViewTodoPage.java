package praktikum1;
import java.util.List;

// SRP: Mengurus penampilan seluruh daftar todo.
public class ViewTodoPage extends AbstractPage {

    public ViewTodoPage() {
        super("FITUR: LIHAT SEMUA TODO");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        // DIP: Mengambil list todo dari AppContext.
        List<String> todos = context.getTodoList();

        if (todos.isEmpty()) {
            System.out.println("Daftar pekerjaan masih kosong.");
        } else {
            System.out.println("Daftar Pekerjaan Anda:");
            // SRP: Hanya menampilkan data, tidak mengubahnya.
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }

        System.out.println();

        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        return "MENU";
    }
}