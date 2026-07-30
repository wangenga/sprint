public class Main {

    public static void main(String[] args) {
        double squareArea = AreaCalculator.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = AreaCalculator.calculateArea(5, 10);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = AreaCalculator.calculateArea(7, true);
        System.out.println("Area of circle: " + circleArea);

        double invalidCircleArea = AreaCalculator.calculateArea(7, false);
        System.out.println("Area of circle boolean=false: " + invalidCircleArea);
    }
}