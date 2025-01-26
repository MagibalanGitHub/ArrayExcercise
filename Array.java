import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Size of the array : ");
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=scanner.nextInt();
        }
        for(int ar:arr){
            System.out.println(Arrays.toString(arr));
        }
        int max=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
