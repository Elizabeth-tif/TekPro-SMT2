public class Circle extends Shape {

  private double radius;

  public Circle() {
    super();
    this.radius = 1.0;
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * getRadius() * getRadius();
  }

  public double getPerimeter() {
    return 2 * Math.PI * getRadius();
  }

  @Override
  public String toString() {
    return (
      "A Circle with radius= " +
      getRadius() +
      ", which is a subclass of " +
      super.toString()
    );
  }

  public static void main(String[] args) {
    Circle circle = new Circle();

    System.out.println(circle.toString());
    System.out.println("Area = " + circle.getArea());
    System.out.println("Perimeter = " + circle.getPerimeter());
  }
}
