import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // 8. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        System.out.print("Enter the divider: ");
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();
        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        int sum = 0;
        while (i < size) {
            System.out.print("Enter the " + (i + 1) + " value of an array: ");
            array[i] = scanner.nextInt();
            if (array[i] <= 0) {
                System.out.println("This is not a natural number. Try again");
                continue;
            }
            if (array[i] % divider == 0) {
                sum += array[i];
            }
            i++;
        }
        System.out.println("The sum of elements which can be divided by " + divider + " is " + sum);
    }
}
