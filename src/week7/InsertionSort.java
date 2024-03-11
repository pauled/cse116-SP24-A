package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort <T>{
    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator){
        this.comparator=comparator;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();
        for (T valueToInsert : input){
            int location=0;
            for (T valueToCompare : output){
                if (this.comparator.compare(valueToCompare,valueToInsert)){
                    location++;
                }
            }
            output.add(location,valueToInsert);
        }
        return output;
    }

    public static void main(String[] args) {
        InsertionSort<Integer> sorter=new InsertionSort<>(new IntDecreasing());
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);

        InsertionSort<GameItem> sorter2=new InsertionSort<>(new CloseGameItem());
        ArrayList<GameItem> list2=new ArrayList<>();
        list2.add(new GameItem(1,2));
        list2.add(new GameItem(5,0));
        list2.add(new GameItem(10,20));
        list2.add(new GameItem(0,0));
        list2.add(new GameItem(1,4));
        ArrayList<GameItem> output2=sorter2.sort(list2);
        System.out.println(output2);
    }
}
