package org.example.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Задача 4 : Написать метод, который принимает список чисел и возвращает массив примитивнх типов
public class Task4 {
    public static int[] convertListToArray(List<Integer> numberList) {
        return numberList.stream()
                .mapToInt(Integer::intValue) // Преобразуем каждый Integer в примитивный int
                .toArray(); // Собираем результат в массив int[]


    }

    public static void main(String[] args) {
        // Пример использования метода
        List<Integer> numbers = List.of  (10, 20, 30, 40, 50);

        // Вызываем метод convertListToArray
        int[] resultArray = convertListToArray(numbers);

        // Выводим результат
        for (int number : resultArray) {
            System.out.print(number + " "); // Ожидаемый вывод: 10 20 30 40 50
        }
    }
}