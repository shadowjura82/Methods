import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();

        //  task2_ask1();
        //  task2_ask2();
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

    public static void validatorOfPhone(int clientDeviceYear, byte clientOS) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
            } else System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else System.out.println("Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Ваш телефон не поддерживает наше мобильное приложение\n");
    }

    public static void deliveryDate(short deliveryDistance) {
        byte days = 0;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance < 100) {
            days = 3;
        }
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + "\n");
        } else System.out.println("Свыше 100 км доставки нет\n");
    }

    public static void task1() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите год - ");
        if (inp.hasNextInt()) validatorOfYear(inp.nextInt());
    }

   /*  Прошу не обращать внимания на этот код. Хочу задать вопрос по нему на консультации с наставником в субботу

   public static void task2_ask1() {
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Какая ОС установлена на вашем телефоне? (0 - iOS, 1 - Android) - ");
            if (inp.hasNextByte() && (inp.nextByte() == 0 || inp.nextByte() == 1)) {
                validatorOfPhone(LocalDate.now().getYear(), inp.nextByte());
                break;
            }
            System.out.println("Вы ввели не верное значение. Значение должно быть либо 0, либо 1");
        } while (true);*/

    /*  Прошу не обращать внимания на этот код. Хочу задать вопрос по нему на консультации с наставником в субботу

    public static void task2_ask2() {
        Scanner inp = new Scanner(System.in);
        byte clientOS = -1;
        do {
            System.out.print("Какая ОС установлена на вашем телефоне? (0 - iOS, 1 - Android) - ");
            if (inp.hasNextByte()) clientOS = inp.nextByte();
            if (clientOS == 0 || clientOS == 1) {
                validatorOfPhone(LocalDate.now().getYear(), clientOS);
                break;
            }
            System.out.println("Вы ввели не верное значение. Значение должно быть либо 0, либо 1");
        } while (true);
    }*/

    public static void task2() {
        Scanner inp = new Scanner(System.in);
        byte clientOS = -1;
        System.out.print("Какая ОС установлена на вашем телефоне? (0 - iOS, 1 - Android) - ");
        if (inp.hasNextByte()) clientOS = inp.nextByte();
        if (clientOS == 0 || clientOS == 1) {
            validatorOfPhone(LocalDate.now().getYear(), clientOS);
        } else
            System.out.println("Вы ввели не верное значение. Значение должно быть либо 0, либо 1");
    }

    public static void task3() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите дистанцию - ");
        if (inp.hasNextShort()) deliveryDate(inp.nextShort());
    }
}