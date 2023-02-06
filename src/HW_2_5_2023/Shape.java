package HW_2_5_2023;

public class Shape {

    // 1. Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
    // In circle class create a method to calculate the area of circle. Test your code

    int radius;

    Shape(int radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {

    double pie;

    Circle(double pie, int radius) {
        super(radius);
        this.pie = pie;
    }

    public double circleArea(double pie, int radius) {

        double area = 3.14 * (radius * radius);
        return area;

    }


    public static void main(String[] args) {

        Circle c1 = new Circle(3.14,20);
        System.out.println(c1.circleArea(3.14,20));



    }
}
