package week12.brain2;

public abstract class MentalState {
    protected Student brain;

    public MentalState(Student brain){
        this.brain=brain;
    }
    public abstract void getCloserToExam();
    public abstract void study();
    public abstract void expressFeelings();
}
