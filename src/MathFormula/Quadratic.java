package MathFormula;

public class Quadratic {
    
    public double quadpos(double a, double b, double c){
        return (-b + (Math.sqrt((b * b) - (4 * (a * c))))) / 2 * a;
    }
    public double quadneg(double a, double b, double c){
        return (-b - (Math.sqrt((b * b) - (4 * (a * c))))) / 2 * a;
    }
}
