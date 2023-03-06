package com.example.cricketgame.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Getter
@Setter
@Document(collection = "Team")
public class Team {
    private List<Player> players;
    private String name;
    private int runsToBeat;
    private int totalRuns;
    private int dotBalls;
    private int sixes;
    private int fours;
    private int wickets;
    private int ballsPlayed;
}
