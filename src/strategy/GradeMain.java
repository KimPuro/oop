package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class GradeMain {
    String getGrade(int score){
        return Score.getGrade(score);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Score");
        GradeMain g = new GradeMain();
        String s = g.getGrade(scanner.nextInt());
        System.out.println(s);
    }
}

enum Score {
    A(score -> score >= 90),
    B(score -> score >= 80 && score < 90),
    C(score -> score >= 70 && score < 80),
    D(score -> score >= 60 && score < 70),
    E(score -> score >= 50 && score < 60),
    F(score -> score <= 40);

    private final Predicate<Integer> predicate;

    Score(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    static String getGrade(int score) {
        return Arrays.stream(values())
                .filter(scoreEnum -> scoreEnum.predicate.test(score))
                .findFirst()
                .map(Enum::toString)
                .orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}