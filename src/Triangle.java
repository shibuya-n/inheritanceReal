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
        System.out.println("How many sides are there? ");
        base = Integer.parseInt(getInput());

    } public int getHeight(){
        return height;
    }
    public void setHeight(){
        System.out.println("How many sides are there? ");
        height = Integer.parseInt(getInput());

    }

    public double getArea(){
        return (base * height)/2;
    }
}
