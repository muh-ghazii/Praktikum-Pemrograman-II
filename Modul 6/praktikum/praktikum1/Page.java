package praktikum1;
// ISP: Interface kecil, hanya 1 method.
public interface Page {

    // ISP: Kontrak sederhana, tidak memaksa method lain.
    // LSP: Semua implementasi Page harus bisa dipanggil lewat method ini.
    String display(AppContext context);
}