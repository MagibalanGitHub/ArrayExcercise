public class SecArr {
    public static void main(String[] args) {
        int arr[]={1,3,2,45,6,12,67,8};

        int large=0;
        int slarge=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>large){
                slarge=large;
                large=arr[i];
            }
            else if (arr[i]>slarge && arr[i]<large){
                slarge=arr[i];
            }
        }
        System.out.println(slarge);
        System.out.println(large);
    }
}
