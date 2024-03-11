package week7;

public class CloseGameItem extends Comparator<GameItem>{
    public double distance(GameItem a){
       double x=a.getxLoc();
       double y=a.getyLoc();
       double out=x*x+y*y;
       return Math.sqrt(out);
    }
    public boolean compare(GameItem a,GameItem b){
        return this.distance(a)<this.distance(b);
    }
}