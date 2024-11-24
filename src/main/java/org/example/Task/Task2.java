package org.example.Task;
//Задача 2 : Написать метод, который принимает список строк и возвращает новый список, где каждая строка преобразована в нижний регистр.
//Подсказка: обратно из стрима получить ArrayList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> updateList(List<String> inputList) { //  наш метод

        List<String> updatedList =  new ArrayList<>();  // создаем объект updatedList
        updatedList.add("БМВ");
        updatedList.add("MЕРСЕДЕС");
        updatedList.add("КИА");
        updatedList.add("ХОНДА");
        updatedList.add("Ренджровер");
        updatedList.add("Хендай");

        ArrayList<String> updatedList1 = inputList.stream()
                .map(String::toLowerCase) // метод который переводит в ниж регистр
                .collect(Collectors.toCollection(ArrayList::new));  // метод который из нашей колекции переводит на Array колекцию

        return updatedList1;
    }

    public static void main(String[] args) {
// Создаем пример входного списка
        List<String> inputList = List.of("AUDI", "TOYOTA", "FORD", "TESLA"); // добавляем в нашу коллекцию объекты

        // Вызываем метод updateList и сохраняем результат
        List<String> resultList = updateList(inputList);
        for (String a : resultList){ // через фор выводим нашу колекцию
            System.out.println(a);
        }

    }
}

