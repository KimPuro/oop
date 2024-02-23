package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main(String[] args) {
        List<BoardDto> articles = new ArrayList<>();
        UtilService utill = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            articles.add(new BoardBuilder()
                    .title(utill.createRandomTitle())
                    .content(utill.createRandomContent())
                    .writer(utill.createRandomName())
                    .build());
        }
        System.out.println(" ====== 게시판 글 목록 ======");
        articles.forEach(i-> System.out.println(i.toString()));

    }
}
