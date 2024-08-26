package prototype;

public class Circle implements Component{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Drawing a circle of " + getRadius() + " radius");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Component clone() {
        return new Circle(radius);
    }
}
