package com.example.cricketgame.service;

import com.example.cricketgame.beans.Team;
import com.example.cricketgame.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamServiceIMPL implements TeamService {
    private final TeamRepository teamRepository;

    @Override
    public void saveTeam(Team team) {
        teamRepository.save(team);
    }

}
