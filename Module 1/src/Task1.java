import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //       1. Составить линейную программу, печатающую значение true, если указанное высказывание является
        //       истинным, и false — в противном случае:
        //       Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        if (number.length() != 4 || Integer.parseInt(number) < 0) {
            throw new IllegalStateException("Wrong number format");
        }
        if ((Integer.parseInt(number.substring(0, 1)) + (Integer.parseInt(number.substring(1, 2)))) ==
                (Integer.parseInt(number.substring(2, 3))) + (Integer.parseInt(number.substring(3, 4)))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
