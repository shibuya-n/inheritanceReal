public class Circle extends Shape{
    public int radius;

    public Circle (int s, String c, int r){
        super(s, c);
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(){
        System.out.println("What is the radius of circle? ");
        radius = Integer.parseInt(getInput());

    }

    public double getArea(){
        return  Math.pow(radius, 2) * 3.14;
    }
}
