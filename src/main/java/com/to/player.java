package com.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class player {
    @Id
    @Column(name="player_id")
    private int playerID;

    @Column(name="name")
    private String playerName;

    @Column(name="country")
    private String teamName;

    @Column(name="age")
    private int age;

    public player() {

    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "player [playerID=" + playerID + ", playerName=" + playerName + ", age=" + age + "]";
    }

    public player( String playerName, String teamName, int age) {
        super();
        this.playerName = playerName;
        this.teamName = teamName;
        this.age = age;
    }



}

