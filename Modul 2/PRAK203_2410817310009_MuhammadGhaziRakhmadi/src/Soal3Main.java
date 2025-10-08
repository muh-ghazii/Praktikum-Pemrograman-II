package PRAK203_2410817310009_MuhammadGhaziRakhmadi.src;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // Pada baris ini terjadi error karena kurangnya titik koma (;) di akhir statement.
        // pl.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        // Atribut umur belum diinisialisasi sehingga outputnya akan menjadi 0.
        // Ditambahkan inisialisasi umur agar sesuai dengan output yang diminta.
        p1.umur = 17;
        p1.setJabatan ("Assasin");

        // Method getNama() dihapus, akses langsung ke atribut 'nama'.
        // Label output juga disesuaikan dari "Nama Pegawai:" menjadi "Nama:".
        // System.out.println("Nama Pegawai: " + pl.getNama());
        System.out.println("Nama: " + p1.nama);
        // Method getAsal() dihapus, akses langsung ke atribut 'asal'.
        // System.out.println("Asal: " + pl.getAsal());
        System.out.println("Asal: " + p1.asal);
        System.out.println("Jabatan: " + p1.jabatan);
        // Output yang diminta adalah "17 tahun", maka ditambahkan string " tahun" saat mencetak.
        // System.out.println("Umur: " + pl.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}