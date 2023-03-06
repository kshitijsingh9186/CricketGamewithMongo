package com.example.cricketgame.beans;

import com.example.cricketgame.utility.Role;
import lombok.Data;

@Data
public class Player {
    private String name;
    private String DOB;
    private Role role;

}
