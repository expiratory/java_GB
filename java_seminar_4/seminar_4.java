package java_seminar_4;

import java.util.HashMap;
import java.util.Scanner;

public class seminar_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        phoneBook.put("expiratory", 123456);
        phoneBook.put("sulfozin", 456789);
        phoneBook.put("mrfeynman", 789123);
        menu(phoneBook);
    }

    static public void menu(HashMap<String, Integer> map) {
        System.out.println(map);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер действия:\n"
                + "1. Добавить номер\n"
                + "2. Удалить номер\n"
                + "3. Поиск по логину\n");
        int choise = in.nextInt();
        if (choise == 1) {
            addNumber(map);
        }
        if (choise == 2) {
            removeNumber(map);
        }
        if (choise == 3) {
            findLogin(map);
        }
        if (choise < 1 && choise > 3) {
            System.out.println("Неверный ввод");
        }
        in.close();
    }

    static public void addNumber(HashMap<String, Integer> map) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String name = in.nextLine();
        System.out.println("Введите номер телефона: ");
        int number = in.nextInt();
        map.put(name, number);
        System.out.println(map);
        in.close();
    }

    static public void removeNumber(HashMap<String, Integer> map) {
        System.out.println(map);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин, который хотите удалить: ");
        String name = in.nextLine();
        map.remove(name);
        System.out.println(map);
        in.close();
    }

    static public void findLogin(HashMap<String, Integer> map) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин, который хотите найти: ");
        String name = in.nextLine();
        if (map.containsKey(name) == true) {
            System.out.println(map.get(name));
        }
        if (map.containsKey(name) == false) {
            System.out.println("Такого логина нет");
        }
        in.close();
    }
}
