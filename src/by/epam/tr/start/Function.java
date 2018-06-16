package by.epam.tr.start;

public class Function {
    public static double calcY(double x){
        double y = 0;
        if (x > 3){
            y = 1/(x*x+1);
        } else {
            y = 9;
        }
        return y;
    }
}
