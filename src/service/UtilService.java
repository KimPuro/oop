package service;

import serviceImpl.UtilServiceImpl;

public interface UtilService {
    public
    int createRandomInt(int start, int end);
    double createRandomDouble(int start, int end);
    String createRandomName();
    String createRandomContent();
    String createRandomTitle();

    String createRandomLowerCaseUsername();
    String createRandomEnglishName();
    String createRandomCompany();
}
