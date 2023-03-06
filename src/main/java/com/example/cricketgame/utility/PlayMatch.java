package com.example.cricketgame.utility;

import com.example.cricketgame.beans.Team;
import com.example.cricketgame.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayMatch {

    private final TeamService teamService;
    private final GetRunsOrWicket getRunsOrWicket;
    public void play(Team team, int runsToBeat, boolean secondTeam) {
        int x, i;
        for (i = 0; i < 300; i++) {
            if (team.getWickets() > 9 || (secondTeam && team.getTotalRuns() > runsToBeat)) {
                break;
            }


            x = getRunsOrWicket.betterRandom();

            if (x == -1) {
                team.setWickets(team.getWickets() + 1);
            } else if (x == 0) {
                team.setDotBalls(team.getDotBalls() + 1);
            } else if (x == 1) {
                team.setTotalRuns(team.getTotalRuns() + 1);
            } else if (x == 2) {
                team.setTotalRuns(team.getTotalRuns() + 2);
            } else if (x == 3) {
                team.setTotalRuns(team.getTotalRuns() + 3);
            } else if (x == 4) {
                team.setTotalRuns(team.getTotalRuns() + 4);
                team.setFours(team.getFours() + 1);
            } else if (x == 5) {
                team.setTotalRuns(team.getTotalRuns() + 5);
            } else {
                team.setTotalRuns(team.getTotalRuns() + 6);
                team.setSixes(team.getSixes() + 1);
            }
        }
        team.setBallsPlayed(i);

        teamService.saveTeam(team);


    }
}
