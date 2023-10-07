package String;
// string is immutable/unchangable if we make change in String object then a new object will get created but there wil be no change in prvious String object

final class StringMutableImmutable {
    private final int i;

    StringMutableImmutable(int i){
        this.i = i;
    }

    public static void main(String[] args) {
        StringMutableImmutable s1 = new StringMutableImmutable(10);
        StringMutableImmutable s2 = s1.modify(100);
        StringMutableImmutable s3 = s1.modify(10);

        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }

    public StringMutableImmutable modify(int i){
        if (this.i ==i){
            return this;
        }
        else {
            return new StringMutableImmutable(i);
        }
    }
}
