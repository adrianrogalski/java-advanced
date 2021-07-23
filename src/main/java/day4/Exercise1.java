package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Collection<Double> numbers = new ArrayList<>();
        numbers.add(10.5);
        numbers.add(21.4);
        numbers.add(6.56);
        System.out.println(numbers);
        List<Double> newNumbers = List.of(3.5, 45.6);
        numbers.addAll(newNumbers);
        boolean hasNumber = numbers.contains(21.4);
        System.out.println(hasNumber);
        numbers.remove("6.56");
        System.out.println(numbers);
        double sum = 0;
        double average = 0;
        for (double number : numbers) {
            sum += number;
        }
        average = sum / numbers.size();
        System.out.println(sum);
        System.out.println(average);
    }
}
