package service;

import model.MemberDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    Map<String, MemberDto> addUsers();

    Map<String, MemberDto> joinUser(Scanner sc);

    String countUsers();

    void loginUser(Scanner sc);

    void updatePassword(Scanner sc);

    void deleteUser(String username);

    void findUserByJob(String job);

    String findUsersByName(String name);
    void findUser(Scanner sc);
    void printUsers();
}
