
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkIsLeapYearAndPrint(2025);
        checkIsLeapYearAndPrint(2028);
        System.out.println("Задача 2");
        checkValidSystemAndPrint(1, 2024);
        checkValidSystemAndPrint(0, 2014);
        checkValidSystemAndPrint(-1, 2014);
        checkValidSystemAndPrint(0, 2026);
        System.out.println("Задача 3");
        int deliveryDays = getDeliveryDays(60);
        System.out.println(deliveryDays);
    }

    private static int getDeliveryDays(int i) {
        return i;
    }

    public static void checkIsLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s год - високосный год%n", year);
        } else {
            System.out.printf("%s год - не високосный год%n", year);
        }
    }
    public static int checkValidSystemAndPrint(int system, int year) {
        int currentYear = LocalDate.now().getYear();
        if (system == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (system == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (system == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (system == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не корректные данные");
        }
        int distance = 95;
        if (distance >= 0 && distance <= 20) {
            System.out.println("Потребуется дней: " + 1);
            return 1;
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + 2);
            return 2;
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");


        }

        return 3;

    }
}
