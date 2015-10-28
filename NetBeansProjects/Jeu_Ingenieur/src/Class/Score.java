/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author zouhairhajji
 */
public class Score {
   private int score;

    public Score() {
        this.score = 0;
    }

    public int getScore() {
        return score;
    }
    public void addScore(int score){
        this.score += score;
    }
    public void addScore(){
        this.addScore(1);
    }

    @Override
    public String toString() {
        return "Score{" + "score=" + score + '}';
    }
    
    
   
   
    
}
