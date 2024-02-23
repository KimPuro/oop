package serviceImpl;

import service.UtilService;


public class UtilServiceImpl implements UtilService {
    private static UtilService instance = new UtilServiceImpl();
    private UtilServiceImpl() {}
    public static UtilService getInstance() {
        return instance;
    }
    @Override
    public int createRandomInt(int start, int end) {
        return start + (int) (Math.random() * end);
    }

    @Override
    public double createRandomDouble(int start, int end) {
        return Double.parseDouble(
                String.format("%.1f", start + (Math.random() * end))
        );

    }
}
