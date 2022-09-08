import java.sql.SQLOutput;
import java.util.Scanner;
public class KINO {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.println("Введите размерность матрицы:");
        n=scanner.nextInt();
        m=scanner.nextInt();
        System.out.println("Введите элементы матрицы:");
        int [][] matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int randNumber=(int)(Math.random() * 10+0);
                matrix[i][j]=randNumber;
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print(" \n");
        }
        System.out.println("Введите номер строки:");
        int s;
        s=scanner.nextInt();
        if(s<0 ||s>n){
            System.out.println("Такой строки не существует!");
            System.exit(1);
        }
        int array[]=new int[m];
        for (int i = 0; i < n; i++) {
            array[i] = matrix[s][i];
        }

        int temp;
        for (int i = 0; i < m/2; i++) {
            temp = array[m-i-1];
            array[m-i-1] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            matrix[s][i] = array[i];
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print(" \n");
        }
    }
}