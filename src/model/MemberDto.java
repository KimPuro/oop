package model;
public class MemberDto {
    private int id;
    private String username;
    private String pw;
    private String name;
    private String personalId;
    private String phoneNumber;
    private String address;
    private String job;

    @Override
    public String toString() {
        return "MemberDto{" +
                "username='" + username + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", personalId='" + personalId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    private double weight;
    private double height;

    public MemberDto(String username) {
        this.username = username;
    }





    // 회원가입에서 사용하는 생성자;
    public MemberDto(String username, String pw, String name, String personalId, String phoneNumber, String address, String job) {
        this.username = username;
        this.pw = pw;
        this.name = name;
        this.personalId = personalId;
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

    public void setUsername(String username) {
        this.username = username;
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

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
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

    public String getUsername() {
        return username;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getPersonalId() {
        return personalId;
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

    }


