package controller;

import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    AuthService auth = AuthServiceImpl.getInstance();

    private Map<String, MemberDto> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public void addUsers() {
        users = auth.addUsers();
    }

    public void findUser(Scanner sc) {
        String userInput = sc.next();
        if (users.containsKey(userInput)) {
            System.out.println(users.get(userInput));
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
        System.out.println(auth.countUsers());
    }

    public void joinUser(Scanner sc) {
        auth.joinUser(sc);
    }

    public void loginUser(Scanner sc) {
        auth.loginUser(sc);
        System.out.println();
    }
    public void updatePassword(Scanner sc) {
        auth.updatePassword(sc);
    }
    public void deleteUser(String username) {
        auth.deleteUser(username);
    }
    public void findUserByJob(String job) {
        auth.findUserByJob(job);
    }
    public void findUsersByName(String name) {
        auth.findUsersByName(name);
    }
}