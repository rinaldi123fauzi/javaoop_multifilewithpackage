package com.tutorial;

class Player{
    private String name;

    Player(String name){
        this.name = name;
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