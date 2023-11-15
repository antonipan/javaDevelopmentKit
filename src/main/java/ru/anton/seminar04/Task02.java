package ru.anton.seminar04;

import java.util.*;

public class Task02 {
    static List<String> manName = new ArrayList<>(Arrays.asList("Иван", "Андрей", "Гораций",
            "Люций", "Юлий", "Иван", "Андрей", "Гораций"));

    public static void main(String[] args) {
        System.out.println(manName.toString());
        Set <String> names = createSetName(manName);
        System.out.println(names);
        System.out.println(miniNameAlpha(names));
        System.out.println(miniNameByLength(names));

        System.out.println(deleteByChar(names, "а"));
    }

    public static Set<String> createSetName (List <String> list) {
        return new HashSet<>(list);
    }

    public static String miniNameAlpha (Set<String> set) {
        return set.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static String miniNameByLength (Set<String> set) {
        return set.stream().min(Comparator.comparing(String::length)).orElse(null);
    }

    public static <T> boolean deleteByChar(Set <T> set, String specifyChar) {
        set.removeIf(name -> set.contains(specifyChar));
        return false;
    }
}
