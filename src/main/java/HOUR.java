import java.util.Scanner;
public class HOUR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input h1,m1,h2,m2,h3,m3.");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int hour = 0;
        int min=0;
        if ((m1 + m3) > 60) {
            hour = h1 + h3 + 1;
            min = (m1 + m3) % 60;
        } else if ((m1 + m3) < 60) {
            hour = h1 + h3;
            min = m1 + m3;
        }
        if (hour > h2)
            System.out.println("Не успеете");
        else if(hour==h2 && min>m2){
            System.out.println("Не успеете");
        } else if(hour==h2 && min==m2) {
            System.out.println("Успеете впритык");
        }else System.out.println("Успеете ");

    }
}