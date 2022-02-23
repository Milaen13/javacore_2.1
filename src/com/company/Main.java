package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Отфильтруйте положительные числа.
        List<Integer> positive = new ArrayList<>();
        for (int number : intList) {
            if (number > 0) positive.add(number);
        }

        // Найдите среди этих положительных чисел четные.
        List<Integer> even = new ArrayList<>();
        for (int number : positive) {
            if (number % 2 == 0) even.add(number);
        }

        // Отсортируйте отфильтрованные числа в порядке возрастания.
        Collections.sort(even);

        // Выведите результат на экран.
        for (int number : even) {
            System.out.println(number);

        }
    }
}
