package thisAndSuper;

public class ThisKeyword1 {
    int x = 100;

    public static void main(String[] args) {
        System.out.println("Hello");
        new ThisKeyword1().get(10);
    }

    void get(int x) {
        System.out.println(this.x); // this will fetch class level data member..!
        System.out.println(x); // this will fetch call by function variable..!
    }
}
