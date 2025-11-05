package soal1;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        paint paint = new paint(350);
        paint.setCoverage(paint.getCoverage());

        rectangle deck = new rectangle(0, 0);
        deck.setLength(20);
        deck.setWidth(30);
        deck.setLength(deck.getLength());
        deck.setWidth(deck.getWidth());

        sphere bigBall = new sphere(0);
        bigBall.setRadius(15);
        bigBall.setRadius(bigBall.getRadius());

        cylinder tank = new cylinder(0, 0);
        tank.setRadius(10);
        tank.setHeight(30);
        tank.setRadius(tank.getRadius());
        tank.setHeight(tank.getHeight());

        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println();
        System.out.println("Number of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
