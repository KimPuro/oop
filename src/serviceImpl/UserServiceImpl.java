package serviceImpl;

import model.MemberDto;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public String join(MemberDto user) {
        return null;
    }

    @Override
    public String login(MemberDto user) {
        return null;
    }

    @Override
    public MemberDto findUserByID(String username) {
        return null;
    }

    @Override
    public void updatePassword(MemberDto user) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<MemberDto> getUserList() {
        return null;
    }

    @Override
    public List<MemberDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<MemberDto> findUserByJob(String job) {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }
}
