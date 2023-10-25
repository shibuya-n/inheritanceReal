public class Triangle extends Shape{
    public int base;
    public int height;

    public Triangle (int s, String c, int b, int h){
        super(s, c);
        base = b;
        height = h;

    }
    public int getBase(){
        return base;
    }
    public void setBase(){
        System.out.println("What is the measurement of the base? ");
        base = Integer.parseInt(getInput());

    } public int getHeight(){
        return height;
    }
    public void setHeight(){
        System.out.println("What is the height? ");
        height = Integer.parseInt(getInput());

    }

    public double getArea(){
        return (double) (base * height) /2;
    }
}
