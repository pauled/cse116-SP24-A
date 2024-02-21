package week5;

public class LLN<S> {
    private S data;
    private LLN next;

    public LLN(S data,LLN next){
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
    public void append(S element){
        if(this.next==null) {
            LLN<S> temp=new LLN(element, null);
            this.next = temp;
        } else {
            this.next.append(element);
        }
    }
    public int size(){
        if (this.next==null){
            return 1;
        } else {
            return 1+this.next.size();
        }
    }
    public LLN insert(S element,int loc){
        if (loc<0){
            return this;
        } else if (loc==0){
            return new LLN(element,this);
        } else {
            insertHelper(element,loc);
            return this;
        }
    }
    public void insertHelper(S element,int loc){
        if (loc==1){
            this.next=new LLN(element,this.next);
        } else if (this.next!=null){
            this.next.insertHelper(element,loc-1);
        }
    }

    public static void main(String[] args) {
        LLN<Double> start=new LLN(1.1,null);
        start=new LLN(2.2,start);
        start=new LLN(3.3,start);
        String out=start.toString();
        System.out.println(out);
        start.append(4.4);
    }
}

