package praktikum1;
import java.util.List;

// SRP: tampilkan semua todo.
public class ViewTodoPage extends AbstractPage {

    public ViewTodoPage() {
        super("FITUR: LIHAT SEMUA TODO");
    }

    @Override
    protected String doContent(AppContext context) {
        List<String> todos = context.getTodoList();

        if (todos.isEmpty()) {
            System.out.println("Daftar pekerjaan masih kosong.");
        } else {
            System.out.println("Daftar Pekerjaan Anda:");
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }

        System.out.println();
        return "MENU";
    }
}