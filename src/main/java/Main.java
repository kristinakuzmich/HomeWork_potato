import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        String phone2=customer.sendPhone();
        if (customer.phone.equals(phone2))
            System.out.println("Совпадает");
        else System.out.println("Не совпадает");
    }

    public static class Customer {
        String lastName;
        String name;
        String date;
        String phone = "+375292417270";

        public String sendPhone() {
            Scanner scanner = new Scanner(System.in);
            String phone1 = scanner.nextLine();
            System.out.println(phone1);
            return phone1;
        }
    }
}