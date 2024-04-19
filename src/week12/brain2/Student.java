package week12.brain2;

public class Student {
    private MentalState state;

    public Student(){
        this.state=new Calm(this);
    }
    public void setState(MentalState state){
        this.state=state;
    }
    public  void getCloserToExam(){
        this.state.getCloserToExam();
    }
    public  void study(){
        this.state.study();
    }
    public  void expressFeelings(){
        this.state.expressFeelings();
    }
    public void passClass(){
        this.state=new Chillin(this);
    }

    public static void main(String[] args) {
        Student carl=new Student();
        carl.study();
        carl.getCloserToExam();
        carl.getCloserToExam();
        //carl.expressFeelings();
        carl.study();
        carl.expressFeelings();
        carl.passClass();
        carl.expressFeelings();
    }
}
