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
        auth.findUser(sc);
    }

    public void printUsers() {
        auth.printUsers();
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