package homework_8;

public class ShapePrinter {
    public static void getShapeName(Shape name) {
        name.getName();
    }
    public void getShapeColor (Shape name) {
        name.getColor();
    }

    public static void main(String[] args) {
        getShapeName(new Quad());
    }
}


