import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int a = in.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the Number of Times Rotation ");
        int d=in.nextInt();
        for(int i=0;i<d;i++){
            int first=arr[0];
            for(int j=0;j<a-1;j++){
                arr[j]=arr[j+1];
            }
            arr[a-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
