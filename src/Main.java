import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
    }

    public static void validatorOfYear(int year) {
        if ((year % 400) == 0) {
            System.out.println(year + " год является високосным\n");
        } else if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                System.out.println(year + " год не является високосным\n");
            } else System.out.println(year + " год является високосным\n");
        } else System.out.println(year + " год не является високосным\n");
    }

    public static void task1() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите год - ");
        if (inp.hasNextInt()) validatorOfYear(inp.nextInt());
    }
}