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

    @Override
    public String createRandomName() {
        String[] names = {"이정재", "마동석", "송강호", "윤여정", "황정민", "정우성", "이병헌", "현 빈", "유해진", "손석구", "전도연", "손예진", "하지원", "김하늘", "송중기", "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜"};
        return names[createRandomInt(0, 20)];
    }

    @Override
    public String createRandomContent() {
        String[] contents = {"국민의 모든 자유와 권리는 국가안전보장","·질서유지 또는 공공복리를 위하여 필요한 경우에 한하여", "법률로써 제한할 수 있으며, 제한하는 ", "경우에도 자유와 권리의 본질적인 내용을 침해할 수 없다.",
                "모든 국민은 법률이 정하는 바에", "의하여 납세의 의무를 진다.", "모든 국민은 법 앞에 평등하다. ", "누구든지 성별·종교 또는 사회적 신분에 의하여 ","정치적·경제적·사회적·문화적 생활의 모든 영역에 ","있어서 차별을 받지 아니한다."
    };
        return contents[createRandomInt(0, 8)];
    }

    @Override
    public String createRandomTitle() {
        String[] titles = {"게시판", "공지사항", "자유게시판", "질문과 답변", "자료실", "토론방", "커뮤니티", "자유게시판", "질문과 답변", "자료실", "토론방", "커뮤니티", "자유게시판", "질문과 답변", "자료실", "토론방", "커뮤니티", "자유게시판", "질문과 답변", "자료실"};
        return titles[createRandomInt(0, 20)];
    }
    public String createRandomCompany() {
        String[] companies = {"삼성전자", "LG전자", "SK하이닉스", "현대자동차", "기아자동차", "POSCO", "NAVER", "카카오", "삼성바이오로직스", "셀트리온", "현대모비스", "LG화학", "삼성SDI", "삼성물산", "LG디스플레이", "SK이노베이션", "SK텔레콤", "LG유플러스", "KT", "한국전력"};
        return companies[createRandomInt(0, 20)];
    }
}
