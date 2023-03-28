import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }
    public static void task1() {
        System.out.println("Задача №1");
        int year = 2023;
        checkLeapYear(year);
    }
    public static int checkLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год  - високосный год");
        } else {
            System.out.println(year + " год  - невисокосный год");
        }
        return year;
    }

    public static void task2() {
        System.out.println("Задача №2");
        int system = 1;
        int year = 2023;
        checkSystemAndYear(system,year);
    }
    public static void checkSystemAndYear (int system, int year){
        int currentYear = LocalDate.now().getYear();
        if (system == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (system == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (system == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (system == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            throw new RuntimeException("Ошибка!!! Проверьте вводные данные");
        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int distanceDelivery = 95;
        int timeDelivery = calculateDeliveryTime(distanceDelivery);
        if (timeDelivery == 0){
            System.out.println("Доставка более 100 км не осуществляется.");
        } else {
            System.out.println("Потребуется дней: " + timeDelivery);
        }
    }
    public static int calculateDeliveryTime (int distance) {
        int timeDelivery = 1;
        if (distance >= 0 && distance <= 20) {
            timeDelivery = 1;
        } else if (distance > 20 && distance <= 60) {
            timeDelivery = timeDelivery + 1;
        } else if (distance > 60 && distance <= 100) {
            timeDelivery = timeDelivery + 2;
        } else {
            return 0;
        }
        return timeDelivery;
    }

}
