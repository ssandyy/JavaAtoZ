package Arrays.sorting;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] a = {16,5,8,7,6,9};
        System.out.println("Before bubble sorting");
        for(int i:a){System.out.print(i+" ");}
        for (int i = 0; i < a.length-1; i++) 
        {
            if(a[i]>a[i+1])
            {
                a[i]=a[i]+a[i+1];
                a[i+1]=a[i]-a[i+1];
                a[i]=a[i]-a[i+1];
            }
            //   OR 

            // for (int i = 0; i < a.length; i++) {
            // for (int j =0; j<a.length-i-1; j++){
            //     if(a[j]>a[j+1]){
            //         a[j]=a[j]+a[j+1];
            //         a[j+1]=a[j]-a[j+1];
            //         a[j]=a[j]-a[j+1];
            //     }
            // }
            // }
        }   
    System.out.println("\nAfter bubble sorting");
    for(int k:a){System.out.print(k+" ");}
}
}