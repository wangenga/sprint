package sprint;
public class AreaCalculator {
    public static double calculateArea(double x){
        double area = 0;

        area = x * x ;

        return area;
    }

    public static double calculateArea(double x, double y){
        double area = 0;

        area = x * y ;

        return area;
    }

    public static double calculateArea(double x, boolean m){
        
        if (m){
            return Math.PI * x * x ;
            
        }else {
            return Double.NaN;
        }

        
    }

}
