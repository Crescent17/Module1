import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        4. Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
//        принадлежит закрашенной области, и false — в противном случае:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        if ((x >= -4 && x <= -2 && y <= 0) || (x >= -2 && x <= 2 && y >= -3 && y <= 4) || (x >= 2 && x <= 4 && y <= 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
