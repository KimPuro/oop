package serviceImpl;

import model.Member;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public String addUsers() {
        return null;
    }

    @Override
    public String join(Member user) {
        return null;
    }

    @Override
    public String login(Member user) {
        return null;
    }

    @Override
    public Member findUserByID(String username) {
        return null;
    }

    @Override
    public void updatePassword(Member user) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<Member> getUserList() {
        return null;
    }

    @Override
    public List<Member> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<Member> findUserByJob(String job) {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }
}
