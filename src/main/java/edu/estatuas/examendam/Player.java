package edu.estatuas.examendam;


public class Player {
    
    private String initials;
    private Byte handicap;
    private Short score;
    private Short points;


    public Player(String initials, Byte handicap) {

        this.initials = initials;
        this.handicap = handicap;
        this.score = 0;
        this.points= 0;
    }

    public String getinitials() {
        return initials;
    }

    public void setinitials(String initials) {
        this.initials = initials;
    }

    public Byte getHandicap() {
        return handicap;
    }


    public int getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(Short stablefordPoints) {
        this.points = stablefordPoints;
    }

    @Override
    public String toString() {
        return "\n" + this.initials + "\s--->" 
                + "\sH'cap:\s" + this.handicap 
                + "\tStrokes:\s" + this.getScore()
                + "\tStableford points:\s" + this.getPoints();
    }
}
