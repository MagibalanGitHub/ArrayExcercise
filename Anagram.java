import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter the first input : ");
        String s1=scanner.nextLine();
        System.out.println(" Enter the second String : ");
        String s2=scanner.nextLine();

        if(isanagram(s1,s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean isanagram(String a,String b){
        if (a.length() != b.length()) {
            return false;
        }
        char[]a1=a.toCharArray();
        char[]b1=b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));

        return Arrays.equals(a1,b1);
    }
}

