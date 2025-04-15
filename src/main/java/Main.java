import one.One;
import one.Two;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        One one = new One(6, 1);
        One two = new One(5, 5);
        One three = new One(5, 2);
        One four = new One(4, 3);
        One five = new One(6, 6);
        One six = new One(1, 3);
        One seven = new One(-1, 1);

        List<One> grades = List.of(one, two, three, four, five, six, seven);

        Two calculator = new Two();

        try {
            calculator.weightedAverage(grades);
            System.out.println("Weighted average: " + calculator.getResult());
        } catch (IllegalArgumentException e) {
            System.out.println("Look: " + e.getMessage());
        }
    }
}