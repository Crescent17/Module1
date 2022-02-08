import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
//    10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        System.out.println("Enter \"n\" value");
        int n = scanner.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (i % 2 == 0) ? j + 1 : n - j;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
