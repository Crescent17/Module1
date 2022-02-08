import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //        2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}
