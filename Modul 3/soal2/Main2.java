package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Country> countryList = new LinkedList<>();

        HashMap<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Januari");
        monthMap.put(2, "Februari");
        monthMap.put(3, "Maret");
        monthMap.put(4, "April");
        monthMap.put(5, "Mei");
        monthMap.put(6, "Juni");
        monthMap.put(7, "Juli");
        monthMap.put(8, "Agustus");
        monthMap.put(9, "September");
        monthMap.put(10, "Oktober");
        monthMap.put(11, "November");
        monthMap.put(12, "Desember");

        int numberOfCountries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCountries; i++) {
            String name = scanner.nextLine();
            String type = scanner.nextLine();
            String leader = scanner.nextLine();

            if (type.equalsIgnoreCase("monarki")) {
                countryList.add(new Country(name, type, leader));
            } else {
                int day = Integer.parseInt(scanner.nextLine());
                int month = Integer.parseInt(scanner.nextLine());
                int year = Integer.parseInt(scanner.nextLine());
                countryList.add(new Country(name, type, leader, day, month, year, monthMap));
            }
        }

        for (Country country : countryList) {
            country.displayDetail();
        }

        scanner.close();
    }
}