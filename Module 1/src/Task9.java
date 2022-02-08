import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
//    9. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
//    массив, включив второй массив между k-м и (k+1) - м элементами первого.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int firstArraySize = scanner.nextInt();
        System.out.print("Enter the size of the second array: ");
        int secondArraySize = scanner.nextInt();
        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[secondArraySize];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("Enter the " + (i + 1) + " value of the first array: ");
            firstArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Enter the " + (i + 1) + " value of the second array: ");
            secondArray[i] = scanner.nextInt();
        }
        System.out.println(firstArraySize + secondArraySize);
        System.out.println("Enter the value of k between 1 (including) and " + (firstArraySize + secondArraySize));
        int k = 0;
        int difference = 0;
        while (k <= 0 || k > firstArraySize + secondArraySize) {
            k = scanner.nextInt();
            if (k <= 0 || k > firstArraySize + secondArraySize) {
                System.out.println("Invalid format");
            }
        }
        int[] resultArray = new int[firstArraySize + secondArraySize];
        for (int i = 0; i < resultArray.length; i++) {
            if (i >= k && difference < secondArray.length) {
                resultArray[i] = secondArray[i - k];
                difference++;
            } else resultArray[i] = firstArray[i - difference];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
}
