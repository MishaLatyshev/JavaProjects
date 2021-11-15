import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int result = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        a = in.nextInt();
        System.out.print("Введите второе число:");
        b = in.nextInt();
        System.out.print("Введите третье число:");
        c = in.nextInt();
        System.out.print("Введите четвертое число:");
        d = in.nextInt();
        if (a <= b && a <= c && a <= d)result = a;
        else if (b <= a && b <= c && b <= d)result = b;
        else if (c <= a && c <= b && c <= d)result = c;
        else if(d <= a && d <= b && d <= c)result = d;
        System.out.println("Минимальное из введенных чисел - "+result);

    }
}
