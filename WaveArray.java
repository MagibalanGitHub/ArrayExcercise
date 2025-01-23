import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int a = in.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<a-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
