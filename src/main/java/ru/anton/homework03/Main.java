package ru.anton.homework03;

public class Main {
    public static void main(String[] args) {
        // Калькулятор
        System.out.println("Сумма: " + Calculator.sum(3, 2));
        System.out.println("Разность: " + Calculator.subtract(3, 1.5));
        System.out.println("Умножение: " + Calculator.multiply(3, 1.5));
        System.out.println("Деление: " + Calculator.divide(3, 1.5));

        // Сравнение массивов
        Integer[] array1 = new Integer [] {1, 2, 3, 4};
        String [] array2 = new String[] {"1", "2", "3", "4"};
        String [] array3 = new String[] {"One", "Two", "three", "four"};

        System.out.println("Array 1 and Array 2: " + compareArray(array1, array2));
        System.out.println("Array 3 and Array 2: " + compareArray(array3, array2));

        // Значения класса
        String elem1 = "element 1";
        Pair <Integer, Integer> elem2 = new Pair<>(1, 1);
        Pair <String, Pair> pair = new Pair<>(elem1, elem2);
        System.out.println("First: " +pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
        System.out.println("Total: " + pair);
    }

    public static <T, K> boolean compareArray (T [] array1, K [] array2) {
        if(array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].getClass().equals(array2[i].getClass())) {
                return false;
            }
        }
        return true;
    }

}
