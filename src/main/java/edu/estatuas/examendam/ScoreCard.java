package edu.estatuas.examendam;

import java.util.List;

public class ScoreCard {
    private Player[] players;
    private Course course;
    private List<Hole> holes;

    public ScoreCard(Player[] players, Course course, List<Hole> holes) {
        this.players = players;
        this.course = course;
        this.holes = holes;
    }

    public Player[] getPlayerCourse() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Hole> getHoles() {
        return holes;
    }

    public void setHoles(List<Hole> holes) {
        this.holes = holes;
    }

}
