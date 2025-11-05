package soal1;

public class rectangle extends shape {
    private double length;
    private double width;

    public rectangle(double l, double w) {
        super("Rectangle");
        setLength(l);
        setWidth(w);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + getLength() + " and width " + getWidth();
    }
}