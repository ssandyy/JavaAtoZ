package generic;

public class Box {
    Object general; // Object class is the top/base class of all classes in Java.
    String name;

    public Box(Object general) {
        this.general = general;
    }
    public Box(String name) {
        this.name = name;
    }

    public Object getGeneral() {
        return general;
    }

    public String getName() {
        return name;
    }

}
