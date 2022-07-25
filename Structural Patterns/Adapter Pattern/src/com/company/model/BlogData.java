package com.company.model;

public class BlogData {
    private String title;
    private String content;

    public BlogData(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BlogData{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
