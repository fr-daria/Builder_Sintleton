package org.example;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число отвечающее за размер списка");
        int n = scanner.nextInt();
        System.out.println("Введите число отвечающее за верхнюю границу значений элементов");
        int m = scanner.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(m));
        }
        System.out.println("Введите число для фильтрации списка");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);

        System.out.println(filter.filterOut(list));
    }
}
