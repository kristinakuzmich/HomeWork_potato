import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Customer2 customer=new Customer2(new String[]{"29","Филипповича"});
        customer.ifEquals();

    }

    public static class Customer2 {
        String lastName;
        String name;
        String date;
        String phone = "+375292417270";
        String [] address=new String[]{"29","Филипповича"};
        String [] addr=new String[2];

        public Customer2(String[] address) {
            this.address = address;
        }

        public void ifEquals(){
            Scanner scanner=new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                addr[i]=scanner.nextLine();
            }
            scanner.close();


            if(Arrays.deepEquals(addr,address)){
                System.out.println("Совпадает");}
                else System.out.println("Не совпадает");

        }

    }
}