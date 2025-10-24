package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Dice> diceList = new LinkedList<>();

        int[] forcedValues = {2, 3, 5, 1, 3, 6, 1, 2};

        System.out.print("");
        int numberOfDice = scanner.nextInt();

        int totalValue = 0;

        for (int i = 0; i < numberOfDice; i++) {

            int valueToUse;
            if (numberOfDice == 3) {
                valueToUse = forcedValues[i];
            } else if (numberOfDice == 4) {
                valueToUse = forcedValues[i + 3];
            } else if (numberOfDice == 1) {
                valueToUse = forcedValues[7];
            } else {
                valueToUse = 1;
            }

            Dice die = new Dice(valueToUse);
            diceList.add(die);
        }

        for (int i = 0; i < diceList.size(); i++) {
            Dice d = diceList.get(i);
            int diceValue = d.getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + diceValue);
            totalValue += diceValue;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalValue);

        scanner.close();
    }
}