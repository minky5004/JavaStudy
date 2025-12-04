package Chapter2.finalexample;

public class Circle {

    final static double PI = 3.141592;
    final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    Circle changeRadius(double newRadius){
        return new Circle(newRadius);
    }

}
