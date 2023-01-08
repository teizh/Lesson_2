package Animal;

import common_interface.Drawable;
import common_interface_2.SoundProducable;

public abstract class Animal implements Drawable, SoundProducable {
private String name;
private Integer age;


    public Animal(String name, Integer age) {
        this.name=name;
        this.age=age;
    }
    @Override
    public void draw(){

    }
    @Override
    public void callSound(){}


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


}










