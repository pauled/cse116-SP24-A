package week7;

import week4.Player;

public class Weapon extends GameItem{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }

    public static void main(String[] args) {
        Weapon w1=new Weapon(1,2,3);
        System.out.println(w1);
        HealthPotion hp1=new HealthPotion(4,5,6);
        System.out.println(hp1);
    }
    @Override
    public String toString() {
        String ret="damage: "+this.damage+super.toString();
        return ret;
    }
    public void use(Player player){
        player.takeDamage(this.damage);
    }
}
