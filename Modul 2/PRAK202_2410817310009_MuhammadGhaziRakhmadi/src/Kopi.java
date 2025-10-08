package PRAK202_2410817310009_MuhammadGhaziRakhmadi.src;
public class Kopi {
    public String coffeeName;
    public String size;
    public double price;
    private String buyer;

    public void info() {
        System.out.println("Nama Kopi: " + this.coffeeName);
        System.out.println("Ukuran: " + this.size);
        System.out.println("Harga: Rp. " + this.price);
    }

    public void setBuyer(String name) {
        this.buyer = name;
    }

    public String getBuyer() {
        return this.buyer;
    }

    public double getTax() {
        return this.price * 0.11;
    }
}