package praktikum1;

// SINGLE RESPONSIBILITY PRINCIPLE (SRP)
// -------------------------------------
// Class ini hanya bertanggung jawab menangani
// fitur "tambah todo" (input dan penyimpanan 1 item todo).
public class AddTodoPage extends AbstractPage {

    public AddTodoPage() {
        super("FITUR: TAMBAH TODO"); // Judul khusus halaman ini.
    }

    @Override
    public String display(AppContext context) {
        // Semua hal yang berkaitan dengan penambahan todo
        // ada di dalam method ini.

        showHeader();
        showTitle();

        System.out.println("Tambahkan pekerjaan baru ke daftar:");

        // Input todo dari user menggunakan Scanner dari context.
        String todo = prompt(context.getScanner(), "Pekerjaan baru:");

        // Menyimpan todo ke dalam daftar pada AppContext.
        context.addTodo(todo);

        System.out.println();
        System.out.println("'" + todo + "' telah ditambahkan ke daftar.");
        System.out.println();

        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        // Setelah selesai, kembali ke menu utama.
        return "MENU";
    }
}