package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String win) {
        desc = win;
    }

    public static void main(String[] args) {
        String issue = "Fix me ASAP.";
        Fix item = new Fix(issue);
    }
}