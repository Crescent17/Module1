import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //        6. Написать программу нахождения суммы большего и меньшего из трех чисел.
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int temp = Math.min(firstNumber, secondNumber);
        int minResult = Math.min(temp, thirdNumber);
        temp = Math.max(firstNumber, secondNumber);
        int maxResult = Math.max(temp, thirdNumber);
        System.out.println(minResult + maxResult);
    }
}
