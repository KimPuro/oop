package builder;

import model.SubjectDto;

public class SubjectBuilder {
    private int korean;
    private int english;
    private int math;

    public SubjectBuilder korean(int korean) {
        this.korean = korean;
        return this;
    }
    public SubjectBuilder english(int english) {
        this.english = english;
        return this;
    }
    public SubjectBuilder math(int math) {
        this.math = math;
        return this;
    }
    public SubjectDto build() {
        return new SubjectDto(korean, english, math);
    }


}
