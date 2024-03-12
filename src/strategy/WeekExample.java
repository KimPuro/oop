package strategy;
import java.util.Scanner;

interface DayInfoProvider {
    String getDayInfo();
}

enum Week {
    MONDAY(() -> "월요일은 열심히 자바 공부합니다."),
    TUESDAY(() -> "화요일은 열심히 자바 공부합니다."),
    WEDNESDAY(() -> "수요일은 열심히 자바 공부합니다."),
    THURSDAY(() -> "목요일은 열심히 자바 공부합니다."),
    FRIDAY(() -> "금요일은 열심히 자바 공부합니다."),
    SATURDAY(() -> "토요일은 알고리즘을 풀며 휴식합니다."),
    SUNDAY(() -> "일요일은 알고리즘을 풀며 휴식합니다.");

    private final DayInfoProvider dayInfoProvider;

    Week(DayInfoProvider dayInfoProvider) {
        this.dayInfoProvider = dayInfoProvider;
    }

    public String dayInfo() {
        return this.dayInfoProvider.getDayInfo();
    }
}

public class WeekExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력해주세요.");

        System.out.println(Week.valueOf(scanner.next().toUpperCase()).dayInfo());
    }
}
