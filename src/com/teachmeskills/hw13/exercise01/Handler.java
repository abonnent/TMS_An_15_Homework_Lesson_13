package com.teachmeskills.hw13.exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Handler {
    public static void startStream() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(50)); // Генерируем случайные числа от 0 до 49
        }

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        List<Integer> evenNumbersInRange = distinctNumbers.stream()
                .filter(num -> num >= 7 && num <= 17 && num % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> doubledNumbers = distinctNumbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        List<Integer> sortedNumbers = doubledNumbers.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());

        long count = sortedNumbers.stream().count();

        double average = doubledNumbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Исходная коллекция: " + numbers);
        System.out.println("Коллекция без дубликатов: " + distinctNumbers);
        System.out.println("Четные элементы в диапазоне [7, 17]: " + evenNumbersInRange);
        System.out.println("Каждый элемент, умноженный на 2: " + doubledNumbers);
        System.out.println("Первые 4 элемента после сортировки: " + sortedNumbers);
        System.out.println("Количество элементов в стриме: " + count);
        System.out.println("Среднее арифметическое всех чисел в стриме: " + average);
    }
}
