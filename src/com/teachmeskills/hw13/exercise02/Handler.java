package com.teachmeskills.hw13.exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Handler {
    public static void startStream() {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Роман");
        studentNames.add("Дмитрий");
        studentNames.add("Владимир");
        studentNames.add("Андрей");
        studentNames.add("Татьяна");
        studentNames.add("Довлет");
        studentNames.add("Адрей");

        List<String> namesStartingWithA = studentNames.stream()
                .filter(name -> name.toLowerCase().startsWith("а"))
                .collect(Collectors.toList());

        String firstSortedName = namesStartingWithA.stream()
                .sorted()
                .findFirst()
                .orElse("Нет имен, начинающихся с 'а'");

        System.out.println("Имена, начинающиеся на 'а': " + namesStartingWithA);
        System.out.println("Первое имя после сортировки: " + firstSortedName);
    }
}
