package com.lauren.db;

//https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2018
//This is basically similar to the league/team/division/conference structure, but slightly different because players can be called up
//whenever and they can play different positions day to day - not quite sure how to handle that so I'm going to hold off on Player stuff
//which kinda means holding off on everything

public class Player {
    private String playerName;
    private int playerID;
    private String position;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }
}
