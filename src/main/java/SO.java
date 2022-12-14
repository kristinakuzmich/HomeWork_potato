import java.lang.String;
import java.util.*;
public class SO {
    public static StringBuilder getLine2( String... words) {
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (String word : words)
            arrayList.add(word);
        for (int j = 0; j < arrayList.size() - 1; j++) {
            if (arrayList.get(j).charAt(arrayList.get(j).length() - 1) == arrayList.get(j).charAt(0))
                sb.append(arrayList.get(j)).append(" ");
        }
        return sb;
    }

    public static void main(String[] args) {
        SO so = new SO();
        StringBuilder sb = new SO().getLine2( "aca", "bcb", "dfd", "gyg");
        System.out.println(sb);
    }
}