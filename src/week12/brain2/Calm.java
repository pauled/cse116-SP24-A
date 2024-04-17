package week12.brain2;

public class Calm extends MentalState{
    public Calm(Student brain){
        super(brain);
    }
    public  void getCloserToExam(){
        this.brain.setState(new Panic(this.brain));
    }
    public  void study(){
        System.out.println("remaining calm");
    }
    public  void expressFeelings(){
        System.out.println("I am a leaf on the wind");
    }
}
