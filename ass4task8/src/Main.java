public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.addShape(new Circle(5));
        drawing.addShape(new Rectangle(4, 6));
        drawing.addShape(new Triangle(3, 4));

        drawing.calculateArea(); // Should output Total Area: ~108.54
    }
}
