package serviceImpl;

import model.MemberDt0;
import service.KaupService;

public class KaupServiceImpl implements KaupService {

    @Override
    public double createBmi(double height, double weight) {
        MemberDt0 model = new MemberDt0();
        model.setHeight(height);
        model.setWeight(weight);
        return model.createBmi();
    }

    @Override
    public String createBodyMass() {
        return null;
    }
}
