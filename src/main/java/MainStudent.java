public class MainStudent {

    public static void main(String[] args) {
        Student student =new Student("Kovalchyk","Vitaliy");
        student.ball= new int[]{8, 9, 10, 7, 8};
        student.getAverageBall(student.ball);
    }

    public static class Student {
        String lastName;
        String Name;
        int [] ball=new int[5];

        public Student(String lastName, String name) {
            this.lastName = lastName;
            Name = name;
        }

        public void getAverageBall(int [] ball){
            System.out.println("Средний балл студента:"+ (ball[0]+ball[1]+ball[2]+ball[3]+ball[4])/5);
        }

    }
}
