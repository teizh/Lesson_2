
public abstract class Animal implements Drawable {
private String name;
private Integer age;


    public Animal(String name, Integer age) {
        this.name=name;
        this.age=age;
    }
    @Override
    public void draw(){

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}










