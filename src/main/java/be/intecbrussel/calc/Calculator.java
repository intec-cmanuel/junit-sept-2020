package be.intecbrussel.calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double result;
    private List<Double> numbers;

    public Calculator() {
        numbers = new ArrayList<>();
    }

    public void addition() {
        result = numbers.stream()
                .mapToDouble(e -> e)
                .sum();
    }

    public void subtraction() throws TooManyNumbersException, NotEnoughNumbersException {
        if (numbers.size() > 2) {
            throw new TooManyNumbersException();
        } else if (numbers.size() < 2) {
            throw new NotEnoughNumbersException();
        }

        result = numbers.get(0) - numbers.get(1);
    }

    public void multiplication() {
        result = numbers.stream()
                .mapToDouble(e -> e)
                .reduce(1, (acc, el) -> acc * el);
    }

    public void division() throws NotEnoughNumbersException, TooManyNumbersException {
        if (numbers.size() > 2) {
            throw new TooManyNumbersException();
        }
        if (numbers.size() < 2) {
            throw new NotEnoughNumbersException();
        }
        if (numbers.get(1) == 0) {
            throw new ArithmeticException();
        }

        result = numbers.get(0) / numbers.get(1);
    }

    public void power() {
        if (numbers.size() < 2) {
            throw new NotEnoughNumbersException();
        }

        result = numbers.stream()
                .skip(1)
                .reduce(numbers.get(0), (acc, el) -> Math.pow(acc, el));
    }

    public void squareRoot() {
        if (numbers.size() > 1) {
            throw new TooManyNumbersException();
        }
        if (numbers.size() < 1) {
            throw new NotEnoughNumbersException();
        }

        result = Math.sqrt(numbers.get(0));
    }

    public void clear() {
        numbers.clear();
        result = 0;
    }

    public void addNumbers(double... numbers) {
        for (double number : numbers) {
            this.numbers.add(number);
        }
    }

    public double getResult() {
        return result;
    }

    public List<Double> getNumbers() {
        return numbers;
    }
}
