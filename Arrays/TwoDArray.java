package Arrays;

public class TwoDArray {
    //int[][] a;
    //int [][]a;
    //int[] []a;
    //int[][] a = new int[10][10];


public static void main(String[] args) {
    

    int[][] a = new int[3][2];
   a[0][0]=1;
    a[0][1]=2; 
    a[1][0]=3;
    a[1][1]=4;
    a[2][0]=5; 
    a[2][1]=6;

int[][] b = {{1,2,3},{4,5,6}};

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println("array of 'b': ");
    for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b[i].length; j++) {
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }


}
}
