import java.util.Scanner;
public class CarProgram{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите модели Форда и Феррари:");
        String model1=scanner.nextLine();
        String model2=scanner.nextLine();
        System.out.println("Введите года Форда и Феррари:");
        int year2=scanner.nextInt();
        int year1=scanner.nextInt();




        Ford car1=new Ford(model1,year1);
        Ferrari car2=new Ferrari(model2,year2);
        car1.equals();
        car2.equals();
        if(car1.model.equals(car2.model) && car1.year==car2.year)
            System.out.println("Машины эквивалентны");
        else System.out.println("Машины отличаются");

    }

    public static class Car {
        String model;
        String brand;
        int volume;
        int year;

        public void equals(){
            System.out.println("равны ли две машины?");
        }

    }

    public static class Ferrari extends Car {
        public Ferrari(String model, int year) {
            this.model=model;
            this.year=year;
        }
        @Override
        public void equals() {
            System.out.println("Феррари  - Модель: " + model + ", год:" + year);
        }


    }

    public static class Ford extends Car {
        public Ford(String model, int year) {
            this.model=model;
            this.year=year;
        }
        @Override
        public void equals() {
            System.out.println("Форд - Модель: " + model + ", год: " + year);
        }
    }
}




