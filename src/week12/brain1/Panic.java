package week12.brain1;

public class Panic extends MentalState{
    public Panic(){
    }
    public  MentalState getCloserToExam(){
        System.out.println("all my drinks are shaken, not stirred");
        return this;
    }
    public  MentalState study(){
        return new Calm();
    }
    public  MentalState expressFeelings(){
        System.out.println("I AM FREAKING OUT MAN!");
        return this;
    }
}
