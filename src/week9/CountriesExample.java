package week9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class CountriesExample {
    public static ArrayList<String> readFile(String filename){
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lines=readFile("data/cities.csv");
        lines.remove(0);
        for (String line : lines){
            ArrayList<String> splits=new ArrayList<>(Arrays.asList(line.split(",")));
            System.out.println(splits);
            String country=splits.get(0);
            String city=splits.get(1);
            String region=splits.get(2);
            int population=Integer.parseInt(splits.get(3));
            double latitude=Double.parseDouble(splits.get(4));
            double longitude=Double.parseDouble(splits.get(5));
        }
    }
}
