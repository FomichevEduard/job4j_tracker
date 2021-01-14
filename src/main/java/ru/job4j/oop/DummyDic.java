package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String bounce = "Неизвестное слово" + eng;
        return bounce;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String eng1 = translator.engToRus(" dfs");
        System.out.println(eng1);

    }
}
