package org.example.Task;
//Задача 1 : Написать метод, который принимает список строк и возвращает новый список, где каждая строка преобразована в верхний регистр.
//            Подсказка: обратно из стрима получить HashSet

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static   List<String> updateList(List<String> inputList) {
        List<String> updatedList = new ArrayList<>();

        updatedList.add("Молоко");
        updatedList.add("Банан");
        updatedList.add("Шоколад");
        updatedList.add("Конфеты ");
        updatedList.add("Макароны");

         HashSet<String> upperCaseList =inputList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(HashSet::new));
         return inputList;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1);
    }
}

