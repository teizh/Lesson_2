import Animal.Animal;
import Animal.Cat;
import Animal.Dog;
import Figure.*;
import common_interface.Drawable;
import common_interface_2.SoundProducable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Krug ", 3); // klass krug  nahodit
        Triangle triangle = new Triangle("Treugolnik", 5, 5, 6);
        Square square = new Square("Kvadrat", 4);
        Rectangle rectangle = new Rectangle("Pryamougolnik", 4, 4);

        Cat cat = new Cat("Marusya", 2);
        Dog dog = new Dog("Palkan", 10);
        Dog dog1;
        dog1 = new Dog("Sharik", 3);


        Drawable[] drawables = new Drawable[]{circle, triangle,
                square, rectangle, cat, dog};
        SoundProducable[] soundProducables = new SoundProducable[]{dog1};

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
        for (SoundProducable item : soundProducables) {
            if (item instanceof Animal animal) {
                System.out.println(animal.getName());
                System.out.println(((Animal) item).getAge());

            }
            item.callSound();
        }

    }
}



