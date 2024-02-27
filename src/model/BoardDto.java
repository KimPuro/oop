package model;

import builder.SubjectBuilder;

public class BoardDto {
    private String title;
    private String content;
    private String writer;
    private int id;

    public BoardDto(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }
    public SubjectBuilder createSubject() {
        return new SubjectBuilder();
    }
}
