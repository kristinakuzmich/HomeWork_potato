import java.lang.String;
import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        char str2='J';
        char[] chars=str1.toCharArray();
        int count=0;
        for (int i = 0; i < str1.length(); i++) {
            if(chars[i]==str2){
                count++;
            }
        }
        System.out.println(count);
    }
}