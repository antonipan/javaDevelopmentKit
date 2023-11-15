package ru.anton.seminar04;

import java.beans.Introspector;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task03 {
    public static void main(String[] args) {
        Map <String, String> phone = new HashMap<>();
        phone.put("88884324", "Ivan");
        phone.put("855533", "Cici");
        phone.put("8399114", "Ric");
        phone.put("9324", "Aton");
        phone.put("048050000", "Inokenty");
        System.out.println(minPhone(phone));
    }

    public static String minPhone (Map <String, String> phone) {
        Set<Integer> ph = phone.keySet().stream().map(Integer::valueOf).collect(Collectors.toSet());
        int x =  ph.stream().min(Comparator.naturalOrder()).get();
        return String.format("Малый номер: %s у абонента %s", x, phone.get(String.valueOf(x)));
    }


}
