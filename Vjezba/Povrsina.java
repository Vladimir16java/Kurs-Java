package Vjezba;

public class Povrsina {
    public static double area(int n, double side){
        double area=0;
        area=(n*Math.pow(side,2)/(4*Math.tan(Math.PI/n)));
        return area;
    }
}
