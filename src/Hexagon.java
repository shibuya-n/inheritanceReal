import static java.lang.Math.sqrt;

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
        System.out.println("What is the length of one side? ");
        length = Integer.parseInt(getInput());

    }

    public double getArea(){
        return 2.59807621135 * Math.sqrt(length) ;
    }
}
