package day43_MethodOverriding;

public class Square extends Shape{
    public double side;

    public Square(double side){
        this.side = side;
    }

    /*
      3. override super class' Area(), perimeter() methods to the sub classesFormulas:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side

     */

}
