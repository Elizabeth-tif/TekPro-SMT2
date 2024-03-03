public class Square extends Rectangle {

  public Square() {
    super();
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() {
    return super.getWidth();
  }

  public void setSide(double side) {
    setWidth(side);
    setLength(side);
  }

  @Override
  public void setLength(double side) {
    super.setLength(side);
  }

  @Override
  public void setWidth(double side) {
    super.setWidth(side);
  }

  @Override
  public String toString() {
    return (
      "A Square with side= " +
      getSide() +
      ", which is a subclass of " +
      super.toString()
    );
  }

  @Override
  public double getArea() {
    return getSide() * getSide();
  }

  @Override
  public double getPerimeter() {
    return 4 * getSide();
  }

  public static void main(String[] args) {
    Square square = new Square(8);

    System.out.println(square.toString());
    System.out.println("Area = " + square.getArea());
    System.out.println("Perimeter = " + square.getPerimeter());
  }
}
