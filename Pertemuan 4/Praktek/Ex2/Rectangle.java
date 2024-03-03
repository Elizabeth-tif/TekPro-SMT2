public class Rectangle extends Shape {

  private double width;
  private double length;

  public Rectangle() {
    super();
    width = 1.0;
    length = 1.0;
  }

  public Rectangle(double width, double length) {
    super();
    this.width = width;
    this.length = length;
  }

  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getArea() {
    return getWidth() * getLength();
  }

  public double getPerimeter() {
    return 2 * (getWidth() + getLength());
  }

  @Override
  public String toString() {
    return (
      "A Rectangle with width= " +
      getWidth() +
      " and length= " +
      getLength() +
      ", which is a subclass of " +
      super.toString()
    );
  }

  public static void main(String[] args) {
    Rectangle rect = new Rectangle();

    System.out.println(rect.toString());
    System.out.println("Area = " + rect.getArea());
    System.out.println("Perimeter = " + rect.getPerimeter());
  }
}
