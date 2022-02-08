import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //        3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
        Scanner scanner = new Scanner(System.in);
        double firstCathetusLength = scanner.nextInt();
        double secondCathetusLength = scanner.nextInt();
        if (firstCathetusLength <= 0 || secondCathetusLength <= 0) {
            throw new IllegalStateException("Invalid length");
        }
        double hypotenuseLength = Math.sqrt(Math.pow(firstCathetusLength, 2) + Math.pow(secondCathetusLength, 2));
        double perimeter = firstCathetusLength + secondCathetusLength + hypotenuseLength;
        double square = firstCathetusLength * secondCathetusLength / 2;
        System.out.println("Perimeter is " + perimeter + " square is " + square);
    }
}
