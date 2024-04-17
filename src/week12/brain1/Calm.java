package week12.brain1;

public class Calm extends MentalState{
    public Calm(){
    }
    public  MentalState getCloserToExam(){
        return new Panic();
    }
    public  MentalState study(){
        System.out.println("remaining calm");
        return this;
    }
    public  MentalState expressFeelings(){
        System.out.println("I am a leaf on the wind");
        return this;
    }
}
