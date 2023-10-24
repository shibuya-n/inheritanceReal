public class Main {
    public static void main(String[] args) {
        Circle x = new Circle(0, "red", 5);
        System.out.println("Color: " + x.getColor());
        System.out.println("Radius: " + x.getRadius());
        x.setRadius();
        System.out.println("Area: " + x.getArea());

        Rectangle y = new Rectangle(4, "blue", 4, 1);
        System.out.println("Color: " + y.getColor());
        System.out.println("Length: " + y.getLength());
        System.out.println("Width: " + y.getWidth());
        y.setLength();
        y.setWidth();
        System.out.println("Area: " + y.getArea());

        Hexagon z = new Hexagon(6, "purple", 4);
        System.out.println("Color: " + z.getColor());
        System.out.println("Length: " + z.getLength());

        z.setLength();
        System.out.println("Area: " + z.getArea());

        Triangle a = new Triangle(3, "orange", 4, 5);
        System.out.println("Color: " + z.getColor());
        System.out.println("Length: " + z.getLength());
        System.out.println("Width: " + z.getWidth());
        z.setLength();

        System.out.println("Area: " + z.getArea());
    }
}