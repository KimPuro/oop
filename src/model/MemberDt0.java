package model;
public class MemberDt0 {
    private String id;
    private String pw;
    private String name;
    private String personId;
    private String phoneNumber;
    private String address;
    private String job;
    private double weight;
    private double height;

    public MemberDt0() {
    }

    @Override
    public String toString() {
        return "MemberDt0{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public MemberDt0(String id) {
        this.id = id;
    }



    //카우프 지수에서 사용하는 생성자
    public MemberDt0(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // 회원가입에서 사용하는 생성자;
    public MemberDt0(String id, String pw, String pwAgain, String name, String personId, String phoneNumber, String address, String job) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    public int returnRandomHeight() {
        return (int) (Math.random() * 50) + 150;
    }

    public int returnRandomWeight() {
        return (int) (Math.random() * 100) + 30;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setPwAgain(String pwAgain) {
        if (pw.equals(pwAgain)) {
            this.pw = pw;
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height/100;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double createBmi(){
        return weight / height * height;
    }
    public void createBodyMass() {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else if (bmi < 30) {
            System.out.println("비만");
        } else {
            System.out.println("고도비만");
        }
    }
}

