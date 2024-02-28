/*
package view;

import controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserViewSwing extends JFrame {
    private final UserController ctrl;

    public UserViewSwing() {
        ctrl = new UserController();
        ctrl.addUsers();

        setTitle("사용자 관리 프로그램");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI();

        setVisible(true);
    }

    private void createUI() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton joinButton = new JButton("회원가입");
        JButton loginButton = new JButton("로그인");
        JButton findUserButton = new JButton("ID 검색");
        JButton updatePasswordButton = new JButton("비밀번호 변경");
        JButton deleteUserButton = new JButton("회원탈퇴");
        JButton printUsersButton = new JButton("회원목록");
        JButton findUsersByNameButton = new JButton("이름 검색");
        JButton findUserByJobButton = new JButton("직업 검색");
        JButton countUsersButton = new JButton("회원 수");

        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = JOptionPane.showInputDialog("회원가입할 ID를 입력하세요.");
                ctrl.joinUser(userId);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = JOptionPane.showInputDialog("로그인할 ID를 입력하세요.");
                String password = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
                ctrl.loginUser(userId, password);
            }
        });

        findUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = JOptionPane.showInputDialog("검색할 ID를 입력하세요.");
                ctrl.findUser(userId);
            }
        });

        updatePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = JOptionPane.showInputDialog("비밀번호를 변경할 ID를 입력하세요.");
                String newPassword = JOptionPane.showInputDialog("변경할 비밀번호를 입력하세요.");
                ctrl.updatePassword(userId, newPassword);
            }
        });

        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = JOptionPane.showInputDialog("탈퇴할 ID를 입력하세요.");
                ctrl.deleteUser(userId);
            }
        });

        printUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrl.printUsers();
            }
        });

        findUsersByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요.");
                ctrl.findUsersByName(name);
            }
        });

        findUserByJobButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String job = JOptionPane.showInputDialog("검색할 직업을 입력하세요.");
                ctrl.findUserByJob(job);
            }
        });

        countUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrl.countUsers();
            }
        });

        add(joinButton);
        add(loginButton);
        add(findUserButton);
        add(updatePasswordButton);
        add(deleteUserButton);
        add(printUsersButton);
        add(findUsersByNameButton);
        add(findUserByJobButton);
        add(countUsersButton);
    }

    public static void main(String[] args) {
        new UserViewSwing();
    }
}
*/
