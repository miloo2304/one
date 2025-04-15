package one;

import java.util.Collection;

public class Two {
    public double result;

    public double weightedAverage(Collection<One> grades) {

        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException(" Collections is empty (null)");
        }

        grades.forEach(grade -> {
            if (grade.getValue() <= 1 && grade.getValue() >= 6) {
                throw new IllegalArgumentException("Mark " + grade.getValue() + " Allowable range: (0-6)");
            }
            if (grade.getWeight() <= 0) {
                throw new IllegalArgumentException("Wage " + grade.getWeight() + " We can't divide by zero and wages should be positive ");
            }
            if (grade.getWeight() <= 1 && grade.getValue() >= 10) {
                throw new IllegalArgumentException("Wage " + grade.getWeight() + " Allowable range: (0-10)");
            }
        });

        double sumTopSide = grades.stream()
                .mapToDouble(grade -> grade.getValue() * grade.getWeight())
                .sum();
        double sumBotSide = grades.stream()
                .mapToDouble(One::getWeight)
                .sum();

        result = sumTopSide / sumBotSide;
        return result;
    }

    public double getResult() {
        return result;
    }
}