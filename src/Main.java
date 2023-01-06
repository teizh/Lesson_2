import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("krug", 3);
        Triangle triangle = new Triangle("treugolnik", 5, 5, 6 );
        Square square = new Square("kvadrat", 4);
        Rectangle rectangle = new Rectangle("pryamougolnik", 4, 4);
        System.out.println(circle.calculatePerimetr());
        System.out.println(triangle.calculatePerimetr());
        System.out.println(square.calculatePerimetr());
        System.out.println(rectangle.calculatePerimetr());




        System.out.println(circle.calculatePerimetr());
        System.out.println(triangle.calculatePerimetr());
        System.out.println(square.calculatePerimetr());
        System.out.println(rectangle.calculatePerimetr());




    }
}


