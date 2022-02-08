import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //  7. Составить программу вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
        //  Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
        //  второй - соответствующие значения функции:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter h: ");
        int h = scanner.nextInt();
        int x = a;
        String[][] results = new String[(b - a) / h][2];
        for (int i = 0; i < (b - a) / h; i++) {
            double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            results[i][0] = "x = " + x;
            results[i][1] = "   y = " + y;
            x += h;
        }
        for (int i = 0; i < (b - a) / h; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(results[i][j]);
            }
            System.out.println();
        }
    }
}
