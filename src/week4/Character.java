package week4;
import week3.CodeToTest;

public class Character {
    private int battlesWon;
    private int xpPts;

    public Character(){
        this.xpPts=0;
        this.battlesWon=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        this.xpPts+=xp;
    }

    @Override
    public String toString() {
        String out="battles won: "+this.battlesWon;
        out+=" xp: "+this.xpPts;
        return out;
    }
}
