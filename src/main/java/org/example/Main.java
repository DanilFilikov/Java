package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            System.out.print("\nВыберите задание:\n 1)Вывести типы данных\n 2)Сравнение чисел\n" +
                    " 3)Вывод всех простых чисел в заданном диапазоне\n 4)Корзина\n 5)Проверка пароля\n 6)Выход\n");

            switch (in.nextInt()) {
                case 1:
                    getTask1();
                    break;
                case 2:
                    getTask2(in);
                    break;
                case 3:
                    getTask3(in);
                    break;
                case 4:
                    getTask4(in);
                    break;
                case 5:
                    getTask5(in);
                    break;
                case 6:
                    run = false;
                    break;
            }
        }
        in.close();
    }

    public static void getTask1() {

        String string = "Строка";
        char ch = 'а';
        int[] array = {1, 2, 3, 4};
        boolean bool = true;

        System.out.println("Min byte = " + Byte.MIN_VALUE + " Max byte = " + Byte.MAX_VALUE);
        System.out.println("Min short = " + Short.MIN_VALUE + " Max short = " + Short.MAX_VALUE);
        System.out.println("Min int = " + Integer.MIN_VALUE + " Max int = " + Integer.MAX_VALUE);
        System.out.println("Min long = " + Long.MIN_VALUE + " Max long = " + Long.MAX_VALUE);
        System.out.println("Min float = " + Float.MIN_VALUE + " Max float = " + Float.MAX_VALUE);
        System.out.println("Min double = " + Double.MIN_VALUE + " Max double = " + Double.MAX_VALUE);
        System.out.println("String = " + string);
        System.out.println("char = " + ch);
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("bool = " + bool);
    }

    public static void getTask2(Scanner in) {

        System.out.println("Введите 2 числа:");

        int x = in.nextInt();
        int y = in.nextInt();

        if (x == y) {
            System.out.println("Числа равны");
        } else {
            System.out.println(x > y ? x + " Больше " : y + " Больше ");
        }
    }

    public static void getTask3(Scanner in) {

        System.out.println("Введите минимальное и максимальное число:");

        int min = in.nextInt();
        int max = in.nextInt();
        boolean prime;

        for (int i = min; i <= max - 1; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime & (i > 2)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void getTask4(Scanner in) {

        List<String> list = new ArrayList<>();
        boolean quit = false;

        System.out.println("Для выхода из корзины введите quist.\nВведите товар:");

        while (!quit) {
            String product = in.next();
            if (product.equals("quit")) {
                quit = true;
                System.out.println(list);
            }
            list.add(product);
        }
    }


    public static void getTask5(Scanner in) {

        System.out.println("Задайте пароль:");

        String password = in.next();

        while (!(password.equals(in.next()))) {
            System.out.println("Пароль неверный");
        }
    }
}