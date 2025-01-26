import java.util.Scanner;

public class Arra {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        for(int ar:arr){
            System.out.println(ar);
        }

    }
}
