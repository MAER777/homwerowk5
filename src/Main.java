public class Main {
    public static void main(String[] args) {
        test();
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void test() {
        System.out.println("Тестовое");
        char color1 = 'y';
        if (color1 == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else if (color1 == 'y') {
            System.out.println("Желтый. Внимание.");
        } else {
            System.out.println("Зеленый! Проезд разрешен!");
        }
        char color = 'r';
        switch (color) {
            case 'r':
                System.out.println("Красный");
                break;
            case 'y':
                System.out.println("Желтый");
                break;
            case 'g':
                System.out.println("Зеленый");
                break;
            case 'l':
                System.out.println("На лево");
                break;
            default:
                System.out.println("Светофор сломался");
        }
        int age1 = 9;
        if (age1 > 18) {
            System.out.println("Иди праздновать");
            if (age1 < 21) {
                System.out.println("Попей пива");
            } else {
                System.out.println("Можешь пить все что угодно");
            }
        } else {
            if (age1 >= 7) {
                System.out.println("Иди в школу");
            } else {
                System.out.println("Иди в детский сад");
            }
        }
        ///
        ///
        ///
        int age = 5;
        if (age > 18) {
            System.out.println("Иди праздновать");
            if (age < 21) {
                System.out.println("Попей пива");
            } else {
                System.out.println("Можешь пить все что угодно");
            }
        } else if (age >= 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Иди в детский сад");
        }
        ///
        ///
        ///
        int age2 = 6;
        if (age2 == 18) {
            System.out.println("С окончанием школы!");
        } else if (age2 == 21) {
            System.out.println("Теперь можно пить алкоголь");
        } else if (age2 == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }
        ///
        ///
        ///
        int age3 = 6;
        switch (age3) {
            case 18:
                System.out.println("С окончанием школы!");
                break;
            case 21:
                System.out.println("Теперь можно пить алкоголь");
                break;
            case 7:
                System.out.println("Иди в школу");
                break;
            default:
                System.out.println("Пока сказать нечего");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Какой операционной системой в телефоне вы пользуйтесь?");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 4;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Айфон старый");
            } else {
                System.out.println("Айфон новый");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Дроид старый");
            } else {
                System.out.println("Дроид новый");
            }
        }
        int s = 1, a = 111;
        if (s == 0 && a <= 222) {
            System.out.println("ххх");
        } else if (s == 0 && a > 222) {
            System.out.println("ччч");
        } else if (s == 1 && a <= 222) {
            System.out.println("ввв");
        } else if (s == 1 && a > 222) {
            System.out.println("ззз");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2016;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год високосный.");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Год високосный.");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуеться дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуеться дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуеться дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        ///
        int deliveryDis = 1;
        int deliveryDay = 1;
        if (deliveryDis > 20) {
            deliveryDay++;
        }
        if (deliveryDis > 60) {
            deliveryDay++;
        }
        if (deliveryDis > 100) {
            System.out.println("Доставка свыше 100 км не действует");
        }
        System.out.println("Потребуеться дней: " + deliveryDay);
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц Январь, принадлежит к сезону зимы.");
                break;
            case 2:
                System.out.println("Месяц Февраль, принадлежит к сезону зимы.");
                break;
            case 3:
                System.out.println("Месяц Март, принадлежит к сезону весны.");
                break;
            case 4:
                System.out.println("Месяц Апрель, принадлежит к сезону весны.");
                break;
            case 5:
                System.out.println("Месяц Май, принадлежит к сезону весны.");
                break;
            case 6:
                System.out.println("Месяц Июнь, принадлежит к сезону лета.");
                break;
            case 7:
                System.out.println("Месяц Июль, принадлежит к сезону лета.");
                break;
            case 8:
                System.out.println("Месяц Август, принадлежит к сезону лета.");
                break;
            case 9:
                System.out.println("Месяц Сентябрь, принадлежит к сезону осени.");
                break;
            case 10:
                System.out.println("Месяц Окстябрь, принадлежит к сезону осени.");
                break;
            case 11:
                System.out.println("Месяц Ноябрь, принадлежит к сезону осени.");
                break;
            case 12:
                System.out.println("Месяц Декабрь, принадлежит к сезону зимы.");
                break;
            default:
                System.out.println("Хм...такого месяца нет");
        }
    }
}