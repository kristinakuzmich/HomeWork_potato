import java.lang.String;
import java.util.Scanner;
public class StrTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        char[] chars=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        int count=0;
        for (int i = 0; i < str1.length(); i++) {
            if(chars[i]==chars2[0]){
                System.out.println("Есть");
                System.exit(1);
            }
        }
        System.out.println("Нет");
    }
}