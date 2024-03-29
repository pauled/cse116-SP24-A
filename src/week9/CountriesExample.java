package week9;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountriesExample {
    public static ArrayList<String> readFile(String filename){
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
    public static void writeCountries(String filename,
                                      HashMap<String, ArrayList<City>> data){
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write("Country,City,Region,Population,Latitude,Longitude\n");
            for (String country : data.keySet()){
                for (City city : data.get(country)){
                    myWriter.write(city.getCountry()+",");
                    myWriter.write(city.getName()+",");
                    myWriter.write(city.getRegion()+",");
                    myWriter.write(city.getPopulation()+",");
                    myWriter.write(city.getLocation().getLatitude()+",");
                    myWriter.write(city.getLocation().getLongitude()+"\n");
                }
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            /*
            String country=splits.get(0);
            String name=splits.get(1);
            String region=splits.get(2);
            int population=Integer.parseInt(splits.get(3));
            double latitude=Double.parseDouble(splits.get(4));
            double longitude=Double.parseDouble(splits.get(5));
             */
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static HashMap<String, ArrayList<City>> loadCountries(String  filename){
        return loadCountriesRange(filename,0,1000000000);
    }
    public static HashMap<String, ArrayList<City>> loadCountriesRange(String  filename,
                                                                      int min,int max){
        ArrayList<String> lines=readFile(filename);
        HashMap<String, ArrayList<City>> countries=new HashMap<>();
        lines.remove(0);
        for (String line : lines){
            ArrayList<String> splits=new ArrayList<>(Arrays.asList(line.split(",")));
            //System.out.println(splits);
            String country=splits.get(0);
            String name=splits.get(1);
            String region=splits.get(2);
            int population=Integer.parseInt(splits.get(3));
            double latitude=Double.parseDouble(splits.get(4));
            double longitude=Double.parseDouble(splits.get(5));
            Location location=new Location(latitude,longitude);
            City city=new City(name,country,region,population,location);
            if (population>=min && population<=max) {
                if (!countries.containsKey(country)) {
                    countries.put(country, new ArrayList<>());
                }
                countries.get(country).add(city);
            }
        }
        return countries;
    }
    public static void main(String[] args) {
        HashMap<String, ArrayList<City>> countries=
                loadCountries("data/cities_test_2.csv");
        System.out.println(countries);
        writeCountries("data/testWrite.csv",countries);

    }
}
