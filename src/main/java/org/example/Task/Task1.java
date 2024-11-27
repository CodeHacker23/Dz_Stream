package org.example.Task;
//Задача 1 : Написать метод, который принимает список строк и возвращает новый список, где каждая строка преобразована в верхний регистр.
//            Подсказка: обратно из стрима получить HashSet

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static   HashSet<String> updateList(List<String> inputList) {
//        List<String> inputList = new ArrayList<>();

//        inputList.add("Молоко");
//        inputList.add("Банан");
//        inputList.add("Шоколад");
//        inputList.add("Конфеты ");
//        inputList.add("Макароны");

         HashSet<String> upperCaseList = inputList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(HashSet::new));

        return upperCaseList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Молоко");
        inputList.add("Банан");
        inputList.add("Шоколад");
        inputList.add("Конфеты ");
        inputList.add("Макароны");

        HashSet<String> strings = updateList(inputList);
        System.out.println(strings);
    }

}

