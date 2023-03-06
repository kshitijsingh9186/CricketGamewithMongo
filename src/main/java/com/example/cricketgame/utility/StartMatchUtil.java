package com.example.cricketgame.utility;

import com.example.cricketgame.beans.Match;
import com.example.cricketgame.beans.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@RequiredArgsConstructor
public class StartMatchUtil {

    private final PlayMatch playMatch;
    private final Result result;
    private final Toss toss;
    private final TeamUtil teamUtil;
    public String startMatch(){



        Team team1 = teamUtil.createTeam1("INDIA");

        Team team2 = teamUtil.createTeam2("AUSTRALIA");

        Match indvAusODI = new Match("IND v AUS ODI", "MelBourne Cricket Stadium", new Date(), team1, team2, null, null);
        System.out.println("Hello!!!! Folks!!!!!");
        if(toss.toss()){
            /*
             * Team 1 wins the toss and chooses to bat.
             * */
            indvAusODI.setFirst(team1);
            playMatch.play(team1, Integer.MAX_VALUE, false);


            /*
             * Team 2 goes now.
             * */
            indvAusODI.setSecond(team2);
            playMatch.play(team2, team1.getTotalRuns(), true);
        }
        else{
            /*
             * Team 2 wins the toss and chooses to bat.
             * */
            indvAusODI.setFirst(team2);
            playMatch.play(team2, Integer.MAX_VALUE, false);
            /*
             * Team 2 goes now.
             * */
            indvAusODI.setSecond(team1);
            playMatch.play(team1, team2.getTotalRuns(), true);
        }
        String message = result.printResult(indvAusODI ,indvAusODI.getFirst(), indvAusODI.getSecond());
        System.out.println(message);


        return message;

//		MatchController controller = new MatchController();
//		controller.setMatch(indvAusODI);
//
//		if(controller.toss() == 0){
//			/*
//			 * Team 1 goes first.
//			 */
//
//
//		}

    }
}
