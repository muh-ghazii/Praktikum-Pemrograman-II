package praktikum1;
// INTERFACE SEGREGATION PRINCIPLE (ISP)
// -------------------------------------
// Interface ini kecil dan spesifik: hanya berisi satu method display().
// Hal ini mencegah class "halaman" dipaksa mengimplementasikan method
// yang tidak relevan. Setiap halaman hanya wajib punya satu perilaku:
// menampilkan dirinya dengan memanfaatkan AppContext.
public interface Page {

    // Kontrak sederhana untuk semua halaman:
    // - menerima AppContext sebagai konteks data & IO,
// - mengembalikan String berisi key halaman berikutnya untuk navigasi.
    String display(AppContext context);
}