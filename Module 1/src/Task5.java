import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //        5. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
        //        и в четвертую степень — отрицательные.
        pow();
        pow();
        pow();
    }
    public static void pow() {
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println(Math.pow(number, 4));
        } else {
            System.out.println(Math.pow(number, 2));
        }
    }
}
