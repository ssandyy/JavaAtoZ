package Arrays;

class oneDarray {
    

    public static void main(String[] args) {
        //Diffrent type of initialization and decleration of array

        int a[] = new int[10];
        int[] b = {1,2,3,4,5};
        int[] c = new int[]{111,222,333,444,555};

        //print square of array elements
        for (int i = 0; i < a.length; i++) {
            a[i]=i*i;
        }
        System.out.print("square of array: ");
        for (int i : a) {
            System.out.print(i+" ");
        }
//----------------------------------------------------------------------------//
        // print table of array elements
        System.out.print("\n table of array: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=2*(i+1);
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
//----------------------------------------------------------------------------//
        System.out.print("\n Elements of 'b' in array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
        }

        System.out.print("\n Elements of 'c' in array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+ " ");
        }
    }
}
