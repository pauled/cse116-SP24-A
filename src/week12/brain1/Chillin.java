package week12.brain1;

public class Chillin extends MentalState{
    public Chillin(){
    }
    public  MentalState getCloserToExam(){
        System.out.println("I even take exam after semester");
        return this;
    }
    public  MentalState study(){
        System.out.println("studying in the offseason");
        return this;
    }
    public  MentalState expressFeelings(){
        System.out.println("I am done");
        return this;
    }
}
