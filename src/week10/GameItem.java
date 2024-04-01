package week10;


public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }

    public void use(Player player){}

    @Override
    public String toString() {
        String out=" loc ("+this.xLoc+","+this.yLoc+")";
        return out;
    }

    public double getxLoc() {
        return xLoc;
    }

    public double getyLoc() {
        return yLoc;
    }

    public void move(double dx, double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }
}
