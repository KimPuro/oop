package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    Map<String, Member> addUsers();

    Map<String, Member> joinUser(Scanner sc);

    String countUsers();

    void loginUser(Scanner sc);

    void updatePassword(Scanner sc);

    void deleteUser(String username);

    void findUserByJob(String job);

    String findUsersByName(String name);
    void findUser(Scanner sc);
    void printUsers();
}
