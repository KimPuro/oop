package controller;

import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserController {

    private Map<String, MemberDto> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public void addUsers() {
        AuthService auth = AuthServiceImpl.getInstance();
        users = auth.addUsers();
    }
    public void findUser(String username) {
            if(users.containsKey(username)) {
                System.out.println(users.get(username));
            } else {
                System.out.println("해당 유저가 존재하지 않습니다.");
            }
    }
    public void printUsers() {
        for (Map.Entry<String, MemberDto> entry : users.entrySet()) {
            System.out.println(entry.getValue());
            }
        }
    public void countUsers() {
        System.out.println("총 회원 수는 " + users.size() + "명 입니다.");
    }
    }
