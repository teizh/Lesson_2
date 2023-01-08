package Figure;

import common_interface.Drawable;

public abstract class Figure implements Drawable {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    public abstract Integer calculatePerimetr();

    @Override
    public void draw() {

    }
}
