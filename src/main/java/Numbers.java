import java.util.Scanner;
public class Numbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n1,n2,n3.");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();
        int temp;
        if(n2>=n3) {
            temp = n3;
            n3 = n2;
            n2 = temp;
        };
        if(n1>=n2) {
            temp = n2;
            n2 = n1;
            n1 = temp;
        };
        if(n2>=n3) {
            temp = n3;
            n3 = n2;
            n2 = temp;
        }System.out.println(n1 +","+ n2 +","+ n3);
}}
