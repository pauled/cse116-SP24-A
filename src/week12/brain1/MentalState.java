package week12.brain1;

public abstract class MentalState {
    public abstract MentalState getCloserToExam();
    public abstract MentalState study();
    public  MentalState expressFeelings(){
        return this;
    }
}
