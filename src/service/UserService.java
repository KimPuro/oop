package service;

import model.Member;

import java.util.List;

public interface UserService {
    String addUsers();
    String join(Member user);
    String login(Member user);
    Member findUserByID(String username);
    void updatePassword(Member user);
    String deleteUser(String username);
    List<Member> getUserList();
    List<Member> findUsersByName(String name);
    List<Member> findUserByJob(String job);
    int countUsers();
}
