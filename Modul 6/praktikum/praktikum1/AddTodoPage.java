package praktikum1;
// SRP: Mengurus penambahan todo baru.
public class AddTodoPage extends AbstractPage {

    public AddTodoPage() {
        super("FITUR: TAMBAH TODO");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        System.out.println("Tambahkan pekerjaan baru ke daftar:");

        // DIP: Input tetap diambil dari Scanner di AppContext.
        String todo = prompt(context.getScanner(), "Pekerjaan baru:");

        // SRP: Perubahan data todo hanya lewat AppContext.
        context.addTodo(todo);

        System.out.println();
        System.out.println("'" + todo + "' telah ditambahkan ke daftar.");
        System.out.println();

        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        return "MENU";
    }
}