public class MainQuadra {
    public static void main(String[] args) {
        Quadra quadra=new Quadra(1,4,-5);
        quadra.getQuadra();
        quadra.count();
    }

    public static class Quadra {
        int a;
        int b;
        int c;

        public Quadra(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void getQuadra() {
            System.out.println("Квадратное уравнение имеет вид:"+a+"x^2+"+b+"x"+c+"=0");
        }
        public void count(){
            int D=b*b-4*a*c;
            System.out.println("D="+D);
            if(D>0){
                double x1=(-b+Math.sqrt(D))/(2*a);
                double x2=(-b-Math.sqrt(D))/(2*a);
                System.out.println("x1="+x1+", x2="+x2);
            }else if(D==0){
                double x=(-b)/2*a;
                System.out.println("x="+x);
            }
            else System.out.println("Нет корней!");
        }
    }
}
