public class AreaCalculator implements Visitor {
    private double totalArea;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public void visit(Triangle triangle) {
        totalArea += 0.5 * triangle.getBase() * triangle.getHeight();
    }

    public double getTotalArea() {
        return totalArea;
    }
}
