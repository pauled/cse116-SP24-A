package week4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestPlayer {
    @Test
    public void testPlayer(){
        Player p1=new Player(42);
        Player p2=new Player(42);
        assertEquals("Players sane",p1.toString(),p2.toString());
        assertEquals("Health",p1.getHP(),p2.getHP());
        assertEquals("MaxHP",p1.getMaxHP(),p2.getMaxHP());
        assertEquals("Damage",p1.getDamageDealt(),p2.getDamageDealt());
        //assertEquals("Health",p1.HP,p2.HP);
        //assertEquals("MaxHP",p1.maxHP,p2.maxHP);
    }
}
