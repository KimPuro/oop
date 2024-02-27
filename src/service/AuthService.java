package service;
import model.MemberDto;
import java.util.Map;

public interface AuthService {
    public String join();
    public String login();
    void findUser(String userName);
    Map<String, MemberDto> addUsers();
}
