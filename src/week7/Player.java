package week7;

public class Player extends GameItem{
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int HP){
        super(0,0);
        this.maxHP=HP;
        this.HP=HP;
        this.damageDealt=5;
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
