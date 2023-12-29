package Arrays;

public class ThreeDArray {
    // int[][][] a;  //preffered way
    // int [][][]a;
    // int[] []a[];
    // int [][]a[];
    // int []a[][];

   // int[][][] a = new int[3][2][2];
   int[][][] a = {{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};

    public static void main(String[] args) {
        int[][][] a = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } }, { { 9, 10 }, { 11, 12 } } };
        int[][][] b = { { { 1, 2 }, { 3, 4 } , { 5, 6 }}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
System.out.println("array of 'b': ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < b[i][j].length; k++) {
                    System.out.print(b[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
