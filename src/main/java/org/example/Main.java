package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("\n Выберите задание: ");
            int smth = in.nextInt();
            switch (smth) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
            }
        }
    }

    public static void task1() {
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

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            System.out.println(x + " больше");
        } else {
            System.out.println(y + " больше");
        }
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное и максимальное число:");
        int min = in.nextInt();
        int max = in.nextInt();
        System.out.print(min + " ");
        while (min != max) {
            min += 1;
            System.out.print(min + " ");
        }
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Наполинте корзину");
        while (list.size() != 10) {
            list.add(in.next());
            System.out.println(list);
        }
    }

    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте пароль:");
        String password = in.next();
        while (!(password.equals(in.next()))) {
            System.out.println("Пароль неверный");
        }
    }
}