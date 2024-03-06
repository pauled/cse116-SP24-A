package week7;

public class RunGame {
    public static void main(String[] args) {
        Weapon w1=new Weapon(1,2,3);
        Player p1=new Player(10);
        w1.use(p1);
        p1.move(20,20);
        System.out.println(p1);
    }
}
