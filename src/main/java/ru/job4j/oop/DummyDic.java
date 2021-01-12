package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String bounce = "jkgd";
        return bounce;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String eng = translator.engToRus();
        System.out.println("Неизвстное слово " + eng);

    }
}
