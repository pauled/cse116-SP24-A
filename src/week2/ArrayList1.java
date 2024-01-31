package week2;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList1 {
    public static int sum(ArrayList<Integer> arrIn){
        int total=0;
        for (int x=0; x<arrIn.size(); x++){
            total+=arrIn.get(x);
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0; x<3; x++){
            arr1.add(x+3);
        }
        System.out.println(arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2=arr1;
        int temp=sum(arr2);
        System.out.println(temp);

        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Knox",88);
        bills.put("Diggs",14);
        bills.put("Bass",2);
        System.out.println(bills);
        for (String key : bills.keySet()){
            System.out.println(key);
        }
        for (int num : bills.values()){
            System.out.println(num);
        }
        for (String key : bills.keySet()){
            System.out.println(key+": "+bills.get(key));
        }
        for (Integer vals : arr1){
            System.out.println(vals);
        }
    }
}
