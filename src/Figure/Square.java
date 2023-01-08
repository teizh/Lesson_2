package Figure;

public class Square extends Figure {


    private Integer sideA;

    public Square(String name, Integer sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    public Integer calculatePerimetr() {
        return sideA * 4;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("■");
    }

}

