package edu.estatuas.examendam;


public class ComputeCard {
    
    ScoreCard scoreCard;
    GolfPlay golfPlay;

    public ComputeCard(ScoreCard scoreCard, GolfPlay golfPlay){
        this.scoreCard = scoreCard;
        this.golfPlay = golfPlay;
    }


    public void compute(){
        this.golfPlay.scoring(this.scoreCard);
    }

}
