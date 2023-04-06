package task2;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle.getA());
        System.out.println(rectangle.getCircumference());
        rectangle.setB(3.0);
        System.out.println(rectangle.getCircumference());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.isSquare());


    }
}
