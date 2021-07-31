package day5;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

@FunctionalInterface
interface ArithmeticOperator {
    double apply(double a, double b);
}

class Addition implements ArithmeticOperator {

    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}

class Divide implements ArithmeticOperator {
    @Override
    public double apply(double a, double b) {
        return a / b;
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        ArithmeticOperator multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2,2));
        Predicate<Double> isGreaterThanTen = a -> a > 10;
        System.out.println(isGreaterThanTen.test(11.0));
        BiPredicate<Double, Double> isGreaterThan = (a, b) -> a > b;

        List<Double> numbers = List.of(1.0,2.3,12.1,2.4);
        // chce znalezc liczbe z przedzialu
        int count = 0;
        for (Double number : numbers) {
            if (number == 2){
                count++;
            }
        }
        System.out.println(count);
        // jeżeli będę szukał liczb większych od 5 zmieni sie tylko warunek! wiec za każdym razem musiałbym powtarzać 6
        // linijek aby zmien 1 wyrażenie
        count = countNumbers(numbers, a -> a == 2);
        System.out.println(count);
        System.out.println(countNumbers(numbers, x -> x > 5));
        System.out.println(countNumbers(numbers, x -> {
            double a = x % 3;
            if (a == 0) {
                return true;
            }
            else {
                return false;
            }
        }));
    }

    public static int countNumbers(List<Double> numbers, Predicate<Double> predicate) {
        int count = 0;
        for (Double number : numbers) {
            if (predicate.test(number)) {
                count++;
            }
        }
        return count;
    }
}
