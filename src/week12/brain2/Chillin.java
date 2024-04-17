package week12.brain2;

public class Chillin extends MentalState {
    public Chillin(Student brain){
        super(brain);
    }
    public  void getCloserToExam(){
        System.out.println("I even take exam after semester");
    }
    public  void study(){
        System.out.println("studying in the offseason");
    }
    public  void expressFeelings(){
        System.out.println("I am done");
    }
}
