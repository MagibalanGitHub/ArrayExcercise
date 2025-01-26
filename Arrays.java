import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int t=in.nextInt();
        int arr[]=new int[a];
        int ar[];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){

                if(arr[i]+arr[j]==t){
                    System.out.println();
                }

            }
        }

    }
}
