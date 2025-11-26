package praktikum1;
// FACTORY METHOD PATTERN (Creational)
// -----------------------------------
// Class ini mengimplementasikan interface PageFactory dan
// memutuskan objek Page konkret mana yang akan dibuat berdasarkan key.
//
// Metode createPage(key) adalah implementasi Factory Method:
// client (CLIApp) memanggil method ini tanpa tahu kelas konkret
// mana yang di-instansiasi.
public class SimplePageFactory implements PageFactory {

    @Override
    public Page createPage(String key) {
        // Inilah inti Factory Method:
        // - menerima sebuah "key" (string)
// - memutuskan class Page mana yang akan di-new
        //   berdasarkan nilai key tersebut.

        switch (key) {
            case "MENU":
                // Jika key = "MENU", kembalikan halaman menu utama.
                return new MainMenuPage();

            case "SCAN":
                // Jika key = "SCAN", kembalikan halaman scan input.
                return new ScanInputPage();

            case "DISPLAY":
                // Jika key = "DISPLAY", kembalikan halaman tampil data.
                return new DisplayDataPage();

            case "ADD_TODO":
                // Jika key = "ADD_TODO", kembalikan halaman tambah todo.
                return new AddTodoPage();

            case "VIEW_TODOS":
                // Jika key = "VIEW_TODOS", kembalikan halaman lihat todo.
                return new ViewTodoPage();

            default:
                // Fallback: bila key tidak dikenal, kembali ke menu utama.
                return new MainMenuPage();
        }
    }
}