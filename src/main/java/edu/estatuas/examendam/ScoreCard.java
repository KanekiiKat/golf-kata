package edu.estatuas.examendam;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class ScoreCard {
    private Player[] players;
    private Course course;
    private List<Hole> holes = new ArrayList<Hole>();

    private Optional<Player> playerA = Optional.empty();
    private Optional<Player> playerB = Optional.empty();
    private Optional<Player> playerC = Optional.empty();
    private Optional<Player> playerD = Optional.empty();
    
    private Optional<Player>[] playerList = new Optional[4];


    public ScoreCard(Player[] players, Course course, List<Hole> holes) {
        this.players = players;
        this.course = course;
        this.holes = holes;
        this.playerList[0] = playerA;
        this.playerList[1] = playerB;
        this.playerList[2] = playerC;
        this.playerList[3] = playerD;
    }

    public Optional<Player> getPlayerA() {
        return playerA;
    }
    public void setPlayerA(Optional<Player> playerA) {
        this.playerA = playerA;
    }
    public Optional<Player> getPlayerB() {
        return playerB;
    }
    public void setPlayerB(Optional<Player> playerB) {
        this.playerB = playerB;
    }
    public Optional<Player> getPlayerC() {
        return playerC;
    }
    public void setPlayerC(Optional<Player> playerC) {
        this.playerC = playerC;
    }
    public Optional<Player> getPlayerD() {
        return playerD;
    }
    public void setPlayerD(Optional<Player> playerD) {
        this.playerD = playerD;
    }
    public Optional<Player>[] getPlayerList() {
        return playerList;
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
