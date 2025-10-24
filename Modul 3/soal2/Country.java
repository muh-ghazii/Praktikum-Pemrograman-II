package soal2;

import java.util.HashMap;

public class Country {
    private String name;
    private String leadershipType;
    private String leaderName;
    private int independenceDay;
    private String independenceMonthName;
    private int independenceYear;

    public Country(String name, String type, String leader, int day, int month, int year, HashMap<Integer, String> monthMap) {
        this.name = name;
        this.leadershipType = type;
        this.leaderName = leader;
        this.independenceDay = day;
        this.independenceMonthName = monthMap.get(month);
        this.independenceYear = year;
    }

    public Country(String name, String type, String leader) {
        this.name = name;
        this.leadershipType = type;
        this.leaderName = leader;
        this.independenceDay = 0;
        this.independenceMonthName = null;
        this.independenceYear = 0;
    }

    public void displayDetail() {
        String leaderTitle;

        switch (this.leadershipType.toLowerCase()) {
            case "monarki":
                leaderTitle = "Raja";
                break;
            case "presiden":
                leaderTitle = "Presiden";
                break;
            case "perdana menteri":
                leaderTitle = "Perdana Menteri";
                break;
            default:
                leaderTitle = this.leadershipType;
                break;
        }

        System.out.print("Negara " + this.name + " mempunyai " + leaderTitle + " bernama " + this.leaderName);

        if (!this.leadershipType.equalsIgnoreCase("monarki")) {
            System.out.println("\nDeklarasi Kemerdekaan pada Tanggal " + this.independenceDay + " " + this.independenceMonthName + " " + this.independenceYear);
        } else {
            System.out.println();
        }
    }
}