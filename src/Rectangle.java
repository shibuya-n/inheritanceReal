public class Rectangle extends Shape{
    public int length;
    public int width;

    public Rectangle (int s, String c, int l, int w){
        super(s, c);
        length = l;
        width = w;
    }

    public int getLength(){
        return length;
    }
    public void setLength(){
        System.out.println("How many sides are there? ");
        length = Integer.parseInt(getInput());

    }
    public int getWidth(){
        return length;
    }
    public void setWidth(){
        System.out.println("How many sides are there? ");
        width = Integer.parseInt(getInput());

    }

    public double getArea(){
        return  length * width;
    }
}
