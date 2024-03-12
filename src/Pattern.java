import java.util.Scanner;
import java.util.function.Function;

public class Pattern {

    public Pattern(){
        StrategyContext context = new StrategyContext();
        Scanner sc = new Scanner(System.in);
        System.out.println(context.executeStrategy(sc.nextInt()));
    }

    public static void main(String[] args) {
        new Pattern();
    }
}

enum PatternType {
    Prototype("프로토타입"),
    Singleton("싱글톤"),
    Iterator("이터레이터"),
    Factory("팩토리"),
    Facade("파사드"),
    Observer("옵저버"),
    Command("커맨드"),
    Builder("빌더"),
    Bridge("브릿지"),
    Composite("컴포짓"),
    Template("템플릿"),
    Strategy("스트래티지 (전략)"),
    Decorator("데코레이터 (장식)"),
    AbstractMethod("추상 메소드"),
    Mediator("중개자"),
    Visitor("방문자"),
    InterPreter("인터프리터"),
    State("스테이트(일치 상태)"),
    FlyWeight("플라이웨이트"),
    Responsibility("책임"),
    Memento("메멘토"),
    Proxy("프록시"),
    Adapter("어댑터");

    private final String value;

    PatternType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static PatternType get(int index) {
        return PatternType.values()[index];
    }
}

interface Strategy {
    String execute(int index);
}

class ConcreteStrategy implements Strategy {
    @Override
    public String execute(int index) {
        return PatternType.get(index).getValue();
    }
}

class StrategyContext {
    private final Function<Integer, String> strategy;

    public StrategyContext() {
        this.strategy = new ConcreteStrategy()::execute;
    }

    public String executeStrategy(int index) {
        return strategy.apply(index);
    }
}