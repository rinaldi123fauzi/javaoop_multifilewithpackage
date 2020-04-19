package com.tutorial;

//keyword import buat package eksternal
import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        Player player2 = new Player("Ucup");
        player1.show();
        player2.show();
        Console.log("console hallo");
        Player.coba();
    }
}