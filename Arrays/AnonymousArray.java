package Arrays;

public class AnonymousArray {
    public static void main(String[] args) {
        AnonymousArray.sum(new int[]{1,2,3,4,5});

    }

    static void sum(int[] no) {
        int total=0;
        for (int i : no) {
            total+=i;
        }
        System.out.println("Total: "+total);
    }
}