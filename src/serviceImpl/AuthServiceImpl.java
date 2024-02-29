package serviceImpl;
import model.MemberDto;

import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    public Map<String, MemberDto> addUsers() {
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomLowerCaseUsername();
            users.put(username, MemberDto.builder()
                    .username(username)
                    .pw("1")
                    .name(util.createRandomName())
                    .build());
        }
        return users;


    }

    @Override
    public Map<String, MemberDto> joinUser(Scanner sc) {
        String username = sc.next();
        users.put(username, MemberDto.builder()
                .username(username)
                .pw("1")
                .name(util.createRandomName())
                .build());
        return users;
    }

    @Override
    public String countUsers() {
        return "총 회원 수는 " + users.size() + "명 입니다.";
    }

    @Override
    public void loginUser(Scanner sc) {
        String userInput = sc.next();
        String pwInput = sc.next();
        if (users.containsKey(userInput) && users.get(userInput).getPw().equals(pwInput)) {
            System.out.println(users.get(userInput).getName() + "님 환영합니다.");
        } else {
            System.out.println("ID 또는 비밀번호가 틀렸습니다.");
        }
    }

    @Override
    public void updatePassword(Scanner sc) {
        String username = sc.next();
        String newPw = sc.next();
        if (users.containsKey(username)) {
            users.get(username).setPw(newPw);
            System.out.println("비밀번호가 변경되었습니다.");
        } else {
            System.out.println("해당 유저가 존재하지 않습니다.");
        }
    }

    @Override
    public void deleteUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            System.out.println("탈퇴되었습니다.");
        } else {
            System.out.println("해당 유저가 존재하지 않습니다.");
        }
    }

    @Override
    public void findUserByJob(String job) {
        if (users.containsValue(job)) {
            System.out.println(users.get(job));
        } else {
            System.out.println("해당 직업을 가진 유저가 존재하지 않습니다.");
        }
    }

    @Override
/*    public void findUsersByName(String name) {
        boolean userFound = false;
        for (Map.Entry<String, MemberDto> entry : users.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                System.out.println(entry.getValue());
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            System.out.println("해당 이름을 가진 유저가 존재하지 않습니다.");
        }
    }*/
    public String findUsersByName(String name) {
        return users.entrySet().stream()
                .filter(entry -> entry.getValue().getName().equals(name))
                .findFirst()
                .map(entry -> {
                    System.out.println(entry.getValue());
                    return entry.getValue().toString();
                })
                .orElse("해당 이름을 가진 유저가 존재하지 않습니다.");
    }

    @Override
    public void findUser(Scanner sc) {
        String userInput = sc.next();
        if (users.containsKey(userInput)) {
            System.out.println(users.get(userInput));
        } else {
            System.out.println("해당 유저가 존재하지 않습니다.");
        }
    }

    @Override
    public void printUsers() {
        for (Map.Entry<String, MemberDto> entry : users.entrySet()) {
            System.out.println(entry.getValue());
    }
}
}