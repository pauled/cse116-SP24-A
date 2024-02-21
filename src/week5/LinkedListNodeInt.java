package week5;

public class LinkedListNodeInt {
    private int data;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int data,LinkedListNodeInt next){
        this.data=data;
        this.next=next;
    }

    @Override
    public String toString() {
        String out="";
        if (this.next==null){
            //base case
            out+=this.data;
        } else {
            //recursive case
            out+=this.data+" ";
            out+=this.next.toString();
        }
        return out;
    }
    public String toString2() {
        if (this.next==null){
            //base case
            return ""+this.data;
        } else {
            //recursive case
            return this.data+" "+this.next.toString2();
        }
    }

    public static void main(String[] args) {
        LinkedListNodeInt start=new LinkedListNodeInt(1,null);
        start=new LinkedListNodeInt(2,start);
        start=new LinkedListNodeInt(3,start);
        String out=start.toString();
        System.out.println(out);
    }
}
