package soal1;

public class paint {
    private double coverage;

    public paint(double c) {
        setCoverage(c);
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public double amount(shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / getCoverage();
    }
}