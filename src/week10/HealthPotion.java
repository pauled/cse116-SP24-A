package week10;


public class HealthPotion extends GameItem {
    private int heal;

    public HealthPotion(double x,double y,int heal){
        super(x,y);
        this.heal=heal;
    }
    public void use(Player player){
        player.takeDamage(-this.heal);
    }
    @Override
    public String toString() {
        String ret="heal: "+this.heal+super.toString()+" ";
        return ret;
    }
}
