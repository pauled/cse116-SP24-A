package week10;

public class RunGame {
    public static void main(String[] args) {
        Weapon w1=new Weapon(1,2,3);
        GameItem gi1=new Weapon(1,2,3);
        GameItem gi2=w1;
        //System.out.println(w1);
        //System.out.println(gi1);
        Weapon w2=(Weapon) gi2;
        Object o1=w2;
        Usable gi3=new HealthPotion(4,5,6);
        //Weapon w3=(Weapon) gi3;
        System.out.println(gi3);
        w1.modify();
        //gi1.modify();
        Player p1=new Player(10);
        w1.use(p1);
        p1.move(20,20);
        System.out.println(p1);
        p1.pickUpItem(w1);
        p1.pickUpItem(gi3);
        Player p2=new Player(20);
        //p2.pickUpItem(p1);
        p2.move(2,3);
    }
}
