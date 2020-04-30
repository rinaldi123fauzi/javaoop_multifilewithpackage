package com.tutorial;

//keyword import buat package eksternal
import com.terminal.Console;

//mengimport static method yg berada di package terpisah
import static com.terminal.Console.log2;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        Player player2 = new Player("Ucup");
        player1.show();
        player2.show();
        Console.log("console hallo");
        Player.coba();
        log2(player2.getName());

        //Overloading constructor
        Player player3 = new Player();
        player3.show();

        //Overloading methods
        int a = Matematika.tambah(1,19);
        System.out.println(a);

        double b = Matematika.tambah(1,0.5);
        System.out.println(b);
    }
}