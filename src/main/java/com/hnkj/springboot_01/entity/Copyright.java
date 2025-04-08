package com.hnkj.springboot_01.entity;

public class Copyright {
    private String name;
    private String author;
    public Copyright(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
