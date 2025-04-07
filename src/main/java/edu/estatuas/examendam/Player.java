package edu.estatuas.examendam;

public class Player {
    
    private String player;
    private int handicap;
    private int score;
    private int stablefordPoints;

    public Player(String player, int handicap) {

        this.player = player;
        this.handicap = handicap;
        this.score = 0;
        this.stablefordPoints = 0;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getHandicap() {
        return handicap;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStablefordPoints() {
        return stablefordPoints;
    }

    public void setStablefordPoints(int stablefordPoints) {
        this.stablefordPoints = stablefordPoints;
    }
}
