public class Square extends Figure{


    private Integer sideA;
    public Square(String name, Integer sideA) {
    super(name);
        this.sideA = sideA;
    }
    @Override
    public Integer calculatePerimetr () {
        return sideA*4;
    }


}
