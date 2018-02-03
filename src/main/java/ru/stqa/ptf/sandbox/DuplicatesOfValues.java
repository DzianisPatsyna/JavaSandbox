package ru.stqa.ptf.sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DuplicatesOfValues {

    HashMap<String, List<Integer>> Duplicates(List<Integer> originalListOfNumbers) {

        ArrayList<Integer> uniqueListOfNumbers = new ArrayList<>();
        ArrayList<Integer> notUniqueListOfNumbers = new ArrayList<>();

        for (int element : originalListOfNumbers) {

            if (uniqueListOfNumbers.size() == 0 || !uniqueListOfNumbers.contains(element)) {
                uniqueListOfNumbers.add(element);
            } else {
                notUniqueListOfNumbers.add(element);
            }
        }

        HashMap<String, List<Integer>> tmpHashMap = new HashMap<>();
        tmpHashMap.put("originalList", originalListOfNumbers);
        tmpHashMap.put("uniqueList", uniqueListOfNumbers);
        tmpHashMap.put("notUniqueList", notUniqueListOfNumbers);

        return tmpHashMap;
    }
}
