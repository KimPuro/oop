package builder;

import model.MemberDto;

public class UserBuilder {
    private String userName;
    private String pw;
    private String name;
    private String personalId;
    private String phoneNumber;
    private String address;
    private String job;
    private double weight;
    private double height;

    public UserBuilder username(String userName) {
        this.userName = userName;
        return this;
    }
    public UserBuilder pw(String pw) {
        this.pw = pw;
        return this;
    }
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }
    public UserBuilder personalId(String personalId) {
        this.personalId = personalId;
        return this;
    }
    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }
    public UserBuilder job(String job) {
        this.job = job;
        return this;
    }
    public UserBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }
    public UserBuilder height(double height) {
        this.height = height;
        return this;
    }
    public MemberDto build() {
        return new MemberDto(userName, pw, name, personalId, phoneNumber, address, job, weight, height);
    }
}
