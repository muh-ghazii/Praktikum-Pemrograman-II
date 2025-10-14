package PRAK201_2410817310009_MuhammadGhaziRakhmadi.src;
import java.text.NumberFormat;
import java.util.Locale;

public class Fruit {
    private String nameFruit;
    private double weight;
    private double price;
    private double purchaseAmount;

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void showInfo() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        double priceKg = this.price / this.weight;
        double priceBeforeDiscount = this.purchaseAmount * priceKg;

        int multipleDiscounts = (int) Math.floor(this.purchaseAmount / 4.0);
        double discountPer4Kg = 0.08 * this.price;
        double totalDiscount = multipleDiscounts * discountPer4Kg;

        double priceAfterDiscount = priceBeforeDiscount - totalDiscount;

        System.out.println("Nama Fruit: " + this.nameFruit);
        System.out.println("Berat: " + this.weight);
        System.out.println("Harga: " + this.price);
        System.out.println("Jumlah Beli: " + this.purchaseAmount + "kg");
        System.out.println("Harga Sebelum Diskon: " + formatter.format(priceBeforeDiscount));
        System.out.println("Total Diskon: " + formatter.format(totalDiscount));
        System.out.println("Harga Setelah Diskon: " + formatter.format(priceAfterDiscount));
        System.out.println();
    }
}