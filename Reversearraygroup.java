import java.util.Arrays;
import java.util.Scanner;

public class Reversearraygroup {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the No of position to be swapped");
        int k=in.nextInt();
        for(int i=0;i<a;i=i+k){
            int first=i;
            int last=Math.min(i+k-1,arr.length-1);

            while(first<last){
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
                first++;
                last--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
