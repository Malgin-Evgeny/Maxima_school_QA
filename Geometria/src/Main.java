import geometrypackage.*;

public class Main {
    private static Shape[] generateShapes() {
        Shape[] shapes = new Shape[25]; // 25
        for (int i = 0; i < (shapes.length / 5); ++i) {
            shapes[i] = new Cicle(5.5 + i);
        }
        for (int i = (shapes.length / 5); i < 2 * (shapes.length / 5); ++i) {
            shapes[i] = new Sqare(6.2 + i);
        }
        for (int i = 2 * (shapes.length / 5); i < 3 * (shapes.length / 5); ++i) {
            shapes[i] = new Rectangle(3.3 + i, 4.4 + i);
        }
        for (int i = 3 * (shapes.length / 5); i < 4 * (shapes.length / 5); ++i) {
            shapes[i] = new Parallelogram(3.5 + i, 4.1 + i);
        }
        for (int i = 4 * (shapes.length / 5); i < (shapes.length); ++i) {
            shapes[i] = new Human(120.1 + i, 80.1 + i);
        }
        return shapes;
    }

    public static void main(String[] args) {
        double comulativeArea = 0;
        for (Shape shape : generateShapes()) {
            comulativeArea += shape.getArea();
        }
        System.out.println(comulativeArea);
    }
}
