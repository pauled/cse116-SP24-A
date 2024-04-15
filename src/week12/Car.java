package week12;

public class Car {
    private boolean totaled;
    public Car(){
        this.totaled=false;
    }
    public void smash(){
        this.totaled=true;
        System.out.println("Car was totaled");
    }
    public void drive(boolean overweight){
        if (this.totaled){
            System.out.println("can't drive totaled car");
        } else if(overweight){
            System.out.println("suspension was damaged");
        } else  {
            System.out.println("driving");
        }
    }
}
