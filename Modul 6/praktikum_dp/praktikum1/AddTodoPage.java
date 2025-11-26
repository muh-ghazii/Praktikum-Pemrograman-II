package praktikum1;
//Halaman konkrit lain dari Template Method.
public class AddTodoPage extends AbstractPage {

    public AddTodoPage() {
        super("FITUR: TAMBAH TODO");
    }

    @Override
    protected String doContent(AppContext context) {
        System.out.println("Tambahkan pekerjaan baru ke daftar:");
        String todo = prompt(context.getScanner(), "Pekerjaan baru:");

        context.addTodo(todo);

        System.out.println();
        System.out.println("'" + todo + "' telah ditambahkan ke daftar.");
        System.out.println();

        return "MENU";
    }
}