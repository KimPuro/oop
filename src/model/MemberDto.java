package model;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberDto {
    private int id;
    private String username;
    private String pw;
    private String name;
    private String personalId;
    private String phoneNumber;
    private String address;
    private String job;

    public MemberDto(String username, String pw, String name, String personalId, String phoneNumber, String address, String job, double weight, double height) {
        this.username = username;
        this.pw = pw;
        this.name = name;
        this.personalId = personalId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.weight = weight;
        this.height = height;
    }

    private double weight;
    private double height;

    public MemberDto(String username) {
        this.username = username;
    }

    public int returnRandomHeight() {
        return (int) (Math.random() * 50) + 150;
    }

    public int returnRandomWeight() {
        return (int) (Math.random() * 100) + 30;
    }



    public void setPwAgain(String pwAgain) {
        if (pw.equals(pwAgain)) {
            this.pw = pw;
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }



    public void createMeter(double height) {
        this.height = height/100;
    }
}


