package week3;

public class PlusMinus {
    public static String letter(double score){
        if(score>=90){
            return "A";
        } else if (score>=80){
            return "B";
        } else if (score>=70){
            return "C";
        } else if (score>=60){
            return "D";
        } else {
            return "F";
        }
    }
    public static String pm(int score){
        int ones=score%10;
        if(score<60){
            return "";
        } else if(score>97){
            return "+";
        } else if (ones>=7){
            return "+";
        } else if(ones>=3){
            return "";
        } else {
            return "-";
        }
    }

    public static void main(String[] args) {
        System.out.println("letter(98) expected: A actual: "+letter(98));
        System.out.println("letter(90.0) expected: A actual: "+letter(90.0));
        System.out.println("letter(89.99) expected: B actual: "+letter(89.99));
        System.out.println("letter(101) expected: A actual: "+letter(101));
        System.out.println("letter(80) expected: B actual: "+letter(80));
        System.out.println("letter(73) expected: C actual: "+letter(73));
        System.out.println("letter(65) expected: D actual: "+letter(65));
        System.out.println("letter(55) expected: F actual: "+letter(55));
        System.out.println("letter(9) expected: F actual: "+letter(9));
        System.out.println("letter(-98) expected: F actual: "+letter(-98));
        double val=10;
        while (val>0){
            val/=2;
            System.out.println(val);
            System.out.printf("%2.8f\n",val);
        }
        System.out.println("val after loop: "+val);

        val=10;
        for ( ;val>0; ){
            val/=2;
            System.out.println(val);
            System.out.printf("%2.8f\n",val);
        }
        System.out.println("val after loop: "+val);

        for (int x=0; x<5; x++){
            System.out.println(x);
            int y=3;
        }
        //System.out.println("x:"+x);
        int y=5;
    }
}
