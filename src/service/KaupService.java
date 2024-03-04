package service;

import model.Member;

public interface KaupService {

    String createBmi(Member member);

    public String createBodyMass(double bmi);

}
