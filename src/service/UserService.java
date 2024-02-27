package service;

import model.MemberDto;

import java.util.List;

public interface UserService {
    String join(MemberDto user);
    String login(MemberDto user);
    MemberDto findUserByID(String username);
    void updatePassword(MemberDto user);
    String deleteUser(String username);
    List<MemberDto> getUserList();
    List<MemberDto> findUsersByName(String name);
    List<MemberDto> findUserByJob(String job);
    int countUsers();
}
