package week12.brain2;

public class Panic extends MentalState {
    public Panic(Student brain){
        super(brain);
    }
    public  void getCloserToExam(){
        System.out.println("all my drinks are shaken, not stirred");
    }
    public  void study(){
        this.brain.setState(new Calm(this.brain));
    }
    public  void expressFeelings(){
        System.out.println("I AM FREAKING OUT MAN!");
    }
}
