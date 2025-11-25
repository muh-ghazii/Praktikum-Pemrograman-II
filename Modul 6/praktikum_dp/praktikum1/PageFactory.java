package praktikum1;
// Design Pattern (Creational): FACTORY METHOD
// - Mendefinisikan interface untuk membuat objek Page berdasarkan key.
public interface PageFactory {

    // Factory Method: dipanggil client (CLIApp) untuk membuat halaman.
    Page createPage(String key);
}