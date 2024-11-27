package org.example.Task;
//Задача 3 : Написать метод, который принимает список чисел
//и возвращает новый список, где к каждому числу добавить по 5000 после чего получить Линкедлист



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<Integer> updateNamber (List<Integer> updateNambers) {


        LinkedList<Integer> updatedNumber1 = updateNambers.stream()  // называем List смотря какой мы хотим добавить наши данные
                .map(namber -> namber + 5000)
                .collect(Collectors.toCollection(LinkedList::new));

        return updatedNumber1;
    }

    public static void main(String[] args) {
        List<Integer> updateNambers = new ArrayList<>();
        updateNambers.add(45);
        updateNambers.add(45678);
        updateNambers.add(9643);
        updateNambers.add(136);
        updateNambers.add(7479);
        updateNambers.add(6932);

        System.out.println(updateNamber(updateNambers));

    }
}
