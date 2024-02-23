package service;

public interface GradeService {
    int getTotalScore(int korean, int english, int math);

    double findAverage(int total);
}
