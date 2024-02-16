package week4;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> members;
    private int battlesWon;

    public Party(){
        this.members=new ArrayList<>();
        this.battlesWon=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0; x<this.members.size(); x++){
            this.members.get(x).winBattle(xp);
        }
    }

    @Override
    public String toString() {
        String out="battles won: "+this.battlesWon;
        for (int x=0; x<this.members.size(); x++){
            out+="\n  "+this.members.get(x);
        }
        return out;
    }

    public void addMembers(Character member){
        this.members.add(member);
    }

    public static void main(String[] args) {
        Character hero1=new Character();
        Character hero2=new Character();
        hero1.winBattle(10);
        Party party=new Party();
        party.addMembers(hero1);
        party.addMembers(hero2);
        party.winBattle(5);
        System.out.println(party);
    }
}
