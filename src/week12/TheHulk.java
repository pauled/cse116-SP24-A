package week12;

public class TheHulk implements State{
    private BruceBanner banner;

    public TheHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void getAngry(){
        System.out.println("already angry");
    }
    public void calmDown(){
        this.banner.setState(new DrBanner(this.banner));
    }
    public void useCar(Car car){
        car.smash();
    }
    public void fight(){
        System.out.println("smash");
    }
}
