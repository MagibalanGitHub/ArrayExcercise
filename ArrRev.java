import java.util.Arrays;
import java.util.Scanner;

public class ArrRev {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println(" Enter the total number of Arrays : ");
        int n=scanner.nextInt();

        for(int i=0;i<=n-1;i++) {
            System.out.println(" Enter the total number of Elements");
            int a = scanner.nextInt();
            int[] arr = new int[a];
            for (int j = 0; j <= a - 1; j++) {
                arr[j]=scanner.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));



            for(int k=0;k<arr.length/2;k++){
                int temp=arr[k];
                arr[k]=arr[arr.length-1-k];
                arr[arr.length-1-k]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
