package decorator;

public abstract class Beverage {
    protected String description;
    public static final int SMALL=1;
    public static final int MIDDLE=2;
    public static final int BIG=3;
    public int size;

    public String getDescription() {
        return description;
    }

    abstract double cost();

    public void setSize(int size){
        this.size=size;
    }

    public int getSize() {
        return size;
    }
}
