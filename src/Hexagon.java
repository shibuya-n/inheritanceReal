public class Hexagon extends Shape{
    public int length;

    public Hexagon (int s, String c, int l){
        super(s, c);
        length = l;
    }

    public int getLength(){
        return length;
    }
    public void setLength(){
        System.out.println("How many sides are there? ");
        length = Integer.parseInt(getInput());

    }

    public double getArea(){
        return  3 * Math.sqrt(3) ;
    }
}
