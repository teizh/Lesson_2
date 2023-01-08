public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Krug ", 3);
        Triangle triangle = new Triangle("Treugolnik", 5, 5, 6);
        Square square = new Square("Kvadrat", 4);
        Rectangle rectangle = new Rectangle("Pryamougolnik", 4, 4);

        Cat cat = new Cat("Marusya", 2);
        Dog dog = new Dog("Palkan", 10);


        Drawable[] drawables = new Drawable[]{circle, triangle, square, rectangle, cat, dog};

        for (Drawable item : drawables) {
            if (item instanceof Figure figure) {
                System.out.println(figure.calculatePerimetr());
                System.out.println(figure.getName());
            } else if (item instanceof Animal animal) {
                System.out.println(animal.getName());
                System.out.println(((Animal) item).getAge());

            }
            item.draw();
        }

    }
}



