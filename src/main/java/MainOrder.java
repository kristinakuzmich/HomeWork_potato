import java.util.Scanner;

public class MainOrder{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String address=scanner.nextLine();
        scanner.close();
        Customerr customer=new Customerr(name,address);
        customer.isEqual();
    }

    public static class Order {
        int weight;
        String nameOrder = "Vitaliy";
        String addressOrder = "St. Street, 23";
    }

    public static class Customerr extends Order {
        String name;
        String address;

        public Customerr(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public void isEqual() {
            if (nameOrder.equals(name) && addressOrder.equals(address)) {
                System.out.println("Заказ принадлежит заказчику");
            } else System.out.println("Не тот заказчик");
        }
    }
}


