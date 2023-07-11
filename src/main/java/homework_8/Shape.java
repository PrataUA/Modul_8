package homework_8;

public abstract class Shape {
    protected String nameShape;

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }
    abstract void getName();
    abstract void getColor();
}
