package Animal;

public class Dog extends Animal {
    public Dog (String name, Integer age) {
        super(name,age);
    }

    @Override
    public void  callSound() {
        System.out.println("\uD83D\uDD0A"+ "Gav Gav");

    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("\uD83D\uDC15");
    }


}
