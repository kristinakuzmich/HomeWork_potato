import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int preNumber, postNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number,power.");
        int number = scanner.nextInt();
        postNumber = number;
        preNumber = number;
        while (number != 0) {
            if (number > preNumber && number > postNumber)
                System.out.println("Local max:" + number);
            number = scanner.nextInt();
        }
    }
}
