package Arrays;

public class JaggedArray {
    
     

    public static void main(String[] args) {
        int num[][] = new int[4][];  // Jagged Array
        num[0] = new int[4];
        num[1] = new int[3];
        num[2] = new int[2];
        num[3] = new int[5];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=i+j;
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int n[]:num){
            for(int m:n){
                System.out.print(m+" ");
            }
        }
        System.out.println();
    }
}
