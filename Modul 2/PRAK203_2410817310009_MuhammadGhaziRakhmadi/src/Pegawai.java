package PRAK203_2410817310009_MuhammadGhaziRakhmadi.src;
// Pada baris ini terjadi error karena nama class tidak sesuai dengan nama object yang dibuat pada file Soal3Main.java (Pegawai p1)
// public class Employee {
public class Pegawai {
    public String nama;
    // Pada baris ini terjadi error karena tipe data 'char' hanya bisa menampung 1 karakter, sedangkan inputnya adalah String "Kingdom of Orvel".
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    // Getter dan Setter tidak digunakan sesuai permintaan soal,
    // sehingga method-method di bawah ini dihapus/tidak diperlukan.
    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }
    // Pada baris ini terjadi error karena method setJabatan tidak memiliki parameter,
    // sehingga variabel 'j' tidak terdefinisi.
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}