package serviceImpl;
import model.SubjectDto;
import service.GradeService;

public class GradeServiceImpl implements GradeService {


    @Override
    public int createTotal(int korean, int english, int math) {
        SubjectDto model = new SubjectDto(korean, english, math);
        model.setKorean(korean);
        model.setEnglish(english);
        model.setMath(math);
        return model.createTotal();
    }

    @Override
    public double createAvg(int total) {
        return total / 3.0;
    }
}
