package praktikum1;
// Design Pattern (Creational): FACTORY METHOD
// - Mendefinisikan interface untuk membuat objek Page berdasarkan key.
// Bagian dari Factory Method Pattern sebagai "Creator" abstrak.
public interface PageFactory {
    Page createPage(String key);
}