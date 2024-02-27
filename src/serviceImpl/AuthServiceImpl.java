package serviceImpl;
import builder.UserBuilder;
import model.MemberDto;

import service.AuthService;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private Map<String, MemberDto> users = new HashMap<>();
    private static AuthService instance = new AuthServiceImpl();
    private UtilService util = UtilServiceImpl.getInstance();

    private AuthServiceImpl() {
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String join() {
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public void findUser(String userName) {

    }

    @Override
    public Map<String, MemberDto> addUsers() {
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomLowerCaseUsername();
            users.put(username, new UserBuilder()
                    .username(username)
                    .pw("1")
                    .name(util.createRandomName())
                    .build());
        }
        return new HashMap<>(users);
    }
}
