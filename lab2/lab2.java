import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число (<15) для вычисления его факториала:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == 0)
                    System.out.println("Факториал 0:" + 1);
                if (number > 1 & number <= 15) {
                    long result = 1;
                    for (int i = 1; i <= number; i++) {
                        result = result * i;
                    }
                    System.out.println("Факториал введенного числа:" + result);
                }
                else {
                    System.out.println("Число не соответствует условиям(0-15)");
                }
            }
            else {
                System.out.println("Ошибка при вводе!");
                scanner.next();
            }
        scanner.close();
    }
}
