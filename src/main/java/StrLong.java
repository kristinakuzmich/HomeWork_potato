import java.lang.String;
import java.util.*;
public class StrLong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ch=scanner.nextLine();
        scanner.close();
        String[] letters = ch.split(" ");
        String count=" ";
        for (int i = 0; i < letters.length; i++) {
            if(count.length()<letters[i].length())
                count=letters[i];
        }
        System.out.println(count);
    }
}