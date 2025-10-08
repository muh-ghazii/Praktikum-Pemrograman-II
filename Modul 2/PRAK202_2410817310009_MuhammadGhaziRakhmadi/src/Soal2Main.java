package PRAK202_2410817310009_MuhammadGhaziRakhmadi.src;
public class Soal2Main {
    public static void main(String[] args) {
        Kopi kopi1 = new Kopi();
        kopi1.coffeeName = "Espresso";
        kopi1.size = "Medium";
        kopi1.price = 25000;
        kopi1.info();
        kopi1.setBuyer("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getBuyer());
        System.out.println("Pajak Kopi: Rp. " + kopi1.getTax());
    }
}