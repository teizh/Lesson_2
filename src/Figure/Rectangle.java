package Figure;


public class Rectangle extends Figure {


    private Integer sideA, sideB;

    public Rectangle(String name, Integer sideA, Integer sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Integer calculatePerimetr() {

        return (sideA + sideB) * 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("▬");
    }

}
