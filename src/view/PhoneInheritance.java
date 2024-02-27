package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("-----집전화-----");
        Phone phone = new Phone();
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone);
        CelPhone cp = new CelPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp);
        System.out.println("-----아이폰-----");
        IPhone iphone = new IPhone();
        iphone.setCompany("애플");
        iphone.setCall("에이다");
        iphone.setPortable(true);
        System.out.println(iphone); // 애플 아이폰으로 톰에게 폰을 휴대한 수 있는 데이터를 전송하다.
        System.out.println("-----안드로이드-----");
        Android android = new Android();
        android.setCompany("삼성");
        android.setCall("재인");
        android.setPortable(true);
        android.setSize("7인치");
        System.out.println(android);

    }
}
class Android extends CelPhone{
    private String size;
    public static String BRAND = "갤럭시 노트";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Android{" +
                ", 제조사='" + company + '\'' +
                BRAND + '\'' +
                ", 수신자='" + call + '\'' +
                "이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                ", 크기='" + size + '\'' +
                '}';
    }
}
class IPhone extends CelPhone{
    private String data;
    public static String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "아이폰{" +
                "제조사='" + super.getCompany() + '\n' +
                BRAND + '\'' +
                ", 수신자='" + super.call + '\n' +
                "이동성=" + super.portable +
                ", 이동유무='" + super.move + '\'' +
                '}';
    }
}

class CelPhone extends Phone {
    protected boolean portable;
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if(portable){
            this.setMove("이동가능");

        }else{
            this.setMove("이동불가능");

        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" +
                "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                "이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}
class Phone {
    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역 변수 => 스태틱영역

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다";

    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 겁니다.";
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사='" + company + '\'' +
                ", 수신자='" + call + '\'' +
                '}';
    }
}
