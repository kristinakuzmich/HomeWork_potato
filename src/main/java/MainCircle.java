public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.count();
    }

    public static class Circle {
        final double Pi=3.1415926536;
        int radius;
        double square;
        double length;

        public Circle(int radius) {
            this.radius = radius;
        }
        public void count(){
            square=Pi*radius*radius;
            length=2*Pi*radius;
            System.out.println("Радиус="+radius+"Площадь круга=" + square + ", \n Длина окружности=" + length);
        }
    }
}
