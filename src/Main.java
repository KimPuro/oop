
import controller.UserController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private UserController ctrl;

    public Main() {
        ctrl = new UserController();
        ctrl.addUsers();

        setTitle("User Management");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JButton joinButton = new JButton("회원가입");
        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 회원가입 로직 구현
            }
        });

        JButton loginButton = new JButton("로그인");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 로그인 로직 구현
            }
        });

        JButton searchButton = new JButton("username 검색");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // username 검색 로직 구현
            }
        });

        contentPane.add(joinButton);
        contentPane.add(loginButton);
        contentPane.add(searchButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}