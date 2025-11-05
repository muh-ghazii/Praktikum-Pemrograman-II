package soal1;

public abstract class shape {
    private String shapeName;

    public shape(String name) {
        setShapeName(name);
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    @Override
    public String toString() {
        return getShapeName();
    }
}