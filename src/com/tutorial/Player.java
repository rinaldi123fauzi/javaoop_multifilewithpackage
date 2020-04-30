package com.tutorial;

class Player{
    private String name;
    private static int jumlahPlayer;

    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    //Overloading constructor
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }

    static void coba(){
        System.out.println("Method Default");
    }
}