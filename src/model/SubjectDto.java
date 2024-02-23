package model;

public class SubjectDto {
    private int korean;
    private int english;
    private int math;

    public SubjectDto(int korean) {
        this.korean = korean;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                '}';
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getKorean() {
        return korean;
    }

    public SubjectDto(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int createTotal() {
        return korean + english + math;
    }
}
