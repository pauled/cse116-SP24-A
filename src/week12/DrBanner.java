package week12;

public class DrBanner implements State{
    private BruceBanner banner;

    public DrBanner(BruceBanner banner){
        this.banner=banner;
    }
    public void getAngry(){
        this.banner.setState(new TheHulk(this.banner));
    }
    public void calmDown(){
        System.out.println("already calm");
    }
    public void useCar(Car car){
        car.drive(false);
    }
    public void fight(){
        System.out.println("this will be ugly");
    }
}
