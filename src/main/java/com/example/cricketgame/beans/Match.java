package com.example.cricketgame.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class Match {
    String name;
    String groundName;
    Date date;
    Team team1, team2, first, second;

    public String toString(){
        return "<p><b><center>" + name + "</center></b></p>" +
                "<p><b><center>" + groundName + "</center></b></p>" +
                "<p><b><center>" + date + "</center></b></p>";

    }
}
