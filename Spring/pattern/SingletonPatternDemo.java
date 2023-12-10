package Spring.pattern;

class SingleObject{
    private static SingleObject instance = null;
    private SingleObject(){}
    public static SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}


public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();
        if(object1 == object2){
            System.out.println("Objects are the same");
        }
    }
}
