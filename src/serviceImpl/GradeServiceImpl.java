package serviceImpl;
import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {


    public static GradeService instance = new GradeServiceImpl();{
    }
    private GradeServiceImpl() {
    }
    public static GradeService getInstance() {
        return instance;
    }


    @Override
    public int getTotalScore(int korean, int english, int math) {
        Subject model = new Subject(korean, english, math);
        model.setKorean(korean);
        model.setEnglish(english);
        model.setMath(math);
        return model.createTotal();
    }

    @Override
    public double findAverage(int total) {
        return total / 3.0;
    }
}
