package PRAK201_2410817310009_MuhammadGhaziRakhmadi.src;

public class Soal1Main {
    public static void main(String[] args) {

        Fruit apel = new Fruit();
        apel.setNameFruit("Apel");
        apel.setWeight(0.4);
        apel.setPrice(7000);
        apel.setPurchaseAmount(40.0);
        apel.showInfo();

        Fruit mangga = new Fruit();
        mangga.setNameFruit("mangga");
        mangga.setWeight(0.2);
        mangga.setPrice(3500);
        mangga.setPurchaseAmount(15.0);
        mangga.showInfo();

        Fruit alpukat = new Fruit();
        alpukat.setNameFruit("alpukat");
        alpukat.setWeight(0.25);
        alpukat.setPrice(10000);
        alpukat.setPurchaseAmount(12.0);
        alpukat.showInfo();
    }
}