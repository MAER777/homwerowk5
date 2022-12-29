public class Main {
    public static void main(String[] args) {
        test();
        task1();
        task2();
    }
    public static void test() {System.out.println("Тестовое");
        char color1 = 'y';
        if (color1 == 'r') {
            System.out.println("Красный! Ехать нельзя!");} else if (color1 == 'y') {
            System.out.println("Желтый. Внимание.");} else {
            System.out.println("Зеленый! Проезд разрешен!");}
        char color = 'r';
        switch (color) {
            case 'r' :
                System.out.println("Красный");
                break;
            case 'y' :
                System.out.println("Желтый");
                break;
            case 'g' :
                System.out.println("Зеленый");
                break;
            case 'l' :
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
            if (age1 >= 7 ) {
                System.out.println("Иди в школу");} else {
                System.out.println("Иди в детский сад");}
        }
        ///
        ///
        ///
        int age = 5;
        if (age > 18) {System.out.println("Иди праздновать");
            if (age < 21) {
                System.out.println("Попей пива");
            } else {System.out.println("Можешь пить все что угодно");
            }
        } else if (age >= 7 ) {
                System.out.println("Иди в школу");} else {
                System.out.println("Иди в детский сад");}
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
    public static void task1() {System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0 :
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1 :
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
        int s = 3;
        int a = 111;
        if (s == 0 && a <= 222) {
            System.out.println("ххх");} else if (s == 0 && a > 222) {
            System.out.println("ччч");} else if (s == 1 && a <= 222) {
            System.out.println("ввв");} else if (s == 1 && a > 222) {
            System.out.println("ззз");}

        }
}