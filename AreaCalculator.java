package sprint;
public class AreaCalculator {
    public static double calculateArea(int x){
        double area = 0;

        area =(double) x * x ;

        return area;
    }

    public static double calculateArea(int x, int y){
        double area = 0;

        area = (double) x * y ;

        return area;
    }

    public static double calculateArea(int x, boolean m){
        
        if (m){
            return (double) Math.PI * x * x ;
            
        }else {
            return Double.NaN;
        }

        
    }

}
