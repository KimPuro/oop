/*
package strategy;
import java.util.Arrays;
import java.util.function.BiFunction;
enum Operator2 {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    Operator2(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static double calculate(String operator, double num1, double num2) {
        return getOperator(operator).expression.apply(num1, num2);
    }

    private static Operator2 getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}

public class TCalc {
    double calculate(double a, String operator, double b) {
        return Operator2.calculate(operator, a, b);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        double d = c.calculate(1,"+", 2);
        System.out.println("Result : "+d);
    }
}*/
