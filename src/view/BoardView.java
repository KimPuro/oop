package view;

import model.Board;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardView {
    public static void main(Scanner sc) {
        List<Board> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            articles.add(Board.builder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }
        System.out.println(" ====== 게시판 글 목록 ======");
        articles.forEach(i-> System.out.println(i.toString()));

    }
}
