package function_method;

public class FunctionWithNoArgAndWithArgs {
    String name;
    int salary;

    void get(String s1, int s2) {
        name = s1;
        salary = s2;
    }

    void show() {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        FunctionWithNoArgAndWithArgs t1 = new FunctionWithNoArgAndWithArgs();
        // FunctionWithNoArgAndWithArgs t2 = new FunctionWithNoArgAndWithArgs();
        t1.get("Sandy", 1000000); // function with args
        t1.show(); // funtion with no-arg
        System.out.println(t1);
    }
}
