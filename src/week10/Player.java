package week10;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory;

    public Player(int HP){
        super(0,0);
        this.maxHP=HP;
        this.HP=HP;
        this.damageDealt=5;
        this.inventory=new ArrayList<>();
    }
    public void pickUpItem(Usable item){
        this.inventory.add(item);
    }
    public void useEntireInventory(){
        for (Usable g : this.inventory){
            g.use(this);
        }
    }
    public int getHP(){
        return this.HP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.getDamageDealt());
    }
    public String toString(){
        String out="Health: "+this.HP+"/"+this.maxHP;
        out+=" damage dealt: "+this.damageDealt;
        out+=" location: "+super.toString();
        return out;
    }
    public static void main(String[] args) {
        Player p2=new Player(5);
        Player p3=new Player(10);
        int hp=p2.getHP();
        p2.attack(p3);
        System.out.println("p3: "+p3);
        System.out.println("p2: "+p2.toString());
    }
}
