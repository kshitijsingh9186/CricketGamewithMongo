package com.example.cricketgame.utility;

public class Toss {

    public boolean toss(){
        return (int)(Math.random() * 2) == 0? true : false ;
    }
}
