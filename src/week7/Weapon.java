package week7;


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
        Player p1=new Player(10);
        System.out.println(p1);
        w1.use(p1);
        p1.move(20,20);
        w1.move(10,10);
        System.out.println(p1);
        System.out.println(w1);
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
