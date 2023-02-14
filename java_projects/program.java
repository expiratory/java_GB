package java_projects;

import java.util.Scanner;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // sumNumbers();
        // multiNumbers();
        // simpleNumbers();
        calculate();
    }

    static public void sumNumbers() {
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static public void multiNumbers() {
        int n = 6;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }
        System.out.println(multi);
    }

    static public void simpleNumbers() {
        boolean simple = true;
        for (int i = 2; i <= 1000; i++) {
            simple = true;
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple == true) {
                System.out.println(i);
            }
        }
    }

    static public void calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int num_A = in.nextInt();
        System.out.println("Введите число B: ");
        int num_B = in.nextInt();
        System.out.println("Введите число, обозначающее знак нужного арифметического действия:\n"
                + "1. +\n"
                + "2. -\n"
                + "3. *\n"
                + "4. /\n");
        int action = in.nextInt();
        in.close();
        if (action == 1) {
            System.out.printf("%d + %d = %d", num_A, num_B, num_A + num_B);
        }
        if (action == 2) {
            System.out.printf("%d - %d = %d", num_A, num_B, num_A - num_B);
        }
        if (action == 3) {
            System.out.printf("%d * %d = %d", num_A, num_B, num_A * num_B);
        }
        if (action == 4) {
            System.out.printf("%d / %d = %d", num_A, num_B, num_A / num_B);
        }
        if (action < 1 || action > 4) {
            System.out.println("Некорректный ввод");
        }
    }
}