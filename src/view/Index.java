package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Index extends JFrame{
    Index() {
        setTitle("홈페이지");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3,10,10));
        JButton joinBtn = new JButton("회원가입");
        this.add(joinBtn);
        setLocation(100,100);
        JButton accountBtn = new JButton("로그인");
        this.add(accountBtn);
        JButton menuBtn = new JButton("메뉴");
        this.add(menuBtn);
        joinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        accountBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        menuBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        setVisible(true);

    }
    public static void main(String[] args) {
        new Index();
    }
}