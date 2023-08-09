package polymorphism;

public class SameArgOverloading {
    public static void main(String[] args) {
        SameArgOverloading sa = new SameArgOverloading();
        sa.show(10, 10);
        sa.show(10f, 20);
        sa.show(40f,80f);
        sa.show(90,60f);
    }

    void show(int x, float y){
        System.out.println("int and float argument ");
    }

    void show(float x, float y){
        System.out.println("float and float argument ");
    }

    void show(int x, int y){
        System.out.println("int and int argument ");
    }

    void show(float x, int y){
        System.out.println("float and int argument ");
    }
}
