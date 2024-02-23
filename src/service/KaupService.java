package service;

import model.MemberDto;

public interface KaupService {

    String createBmi(MemberDto member);

    public String createBodyMass(double bmi);

}
