/*
package strategy;

import java.util.Scanner;

enum Operator {

    plus {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    minus {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    multiply {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    divide {
        @Override
        public int apply(int a, int b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("0으로 나눌 수는 없음");
            }
        }
    };

    public abstract int apply(int a, int b);
}

public class Calculator {

    public int calculate(int a, int b, Operator2 operator2) {
        return operator2.apply(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수, 정수, 연산자");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();

        Calculator calculator = new Calculator();

        try {
            Operator2 op = Operator2.valueOf(operator.toLowerCase());
            System.out.println("Result: " + calculator.calculate(a, b, op));

        } catch (IllegalArgumentException e) {
            System.out.println("operator 오류");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}*/
