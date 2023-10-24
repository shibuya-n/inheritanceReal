import java.util.Scanner;

public abstract class Shape {
    public int sides;
    public String color;

    public Shape (int s, String c){
        sides = s;
        color = c;
    }

    public double getArea(){
        return 0;
    }

    public int getSides(){
        return sides;
    }
    public void setSides(){
        System.out.println("How many sides are there? ");
        sides = Integer.parseInt(getInput());

    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        System.out.println("What is the color of the shape? ");
        color = getInput();
    }

    public static String getInput(){
        Scanner x = new Scanner(System.in);
        return x.nextLine();
    }
}
