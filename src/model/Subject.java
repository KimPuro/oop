package model;

import lombok.*;

@Getter
@NoArgsConstructor
@ToString
@Setter
public class Subject {
    private int korean;
    private int english;
    private int math;

    public Subject(int korean) {
        this.korean = korean;
    }

    public int createTotal() {
        return korean + english + math;
    }

    @Builder
    public Subject(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
