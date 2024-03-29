package week9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;
public class TestCities {
    private void compareCities(City expected,City actual){
        assertEquals(expected.getLocation().getLatitude(),
                actual.getLocation().getLatitude(),.001);
        assertEquals(expected.getLocation().getLongitude(),
                actual.getLocation().getLongitude(),.001);
        assertEquals(expected.getName(),actual.getName());
        assertEquals(expected.getCountry(),actual.getCountry());
        assertEquals(expected.getPopulation(),actual.getPopulation());
        assertEquals(expected.getRegion(),actual.getRegion());
    }
    private void compareCountryHashMaps(HashMap<String, ArrayList<City>> expected,
                                        HashMap<String, ArrayList<City>> actual){
        assertEquals(expected.size(),actual.size());
        for (String country : expected.keySet()){
            assertTrue(actual.containsKey(country));
            ArrayList<City> expectedCities=expected.get(country);
            ArrayList<City> actualCities=actual.get(country);
            assertEquals(expectedCities.size(),actualCities.size());
            for (int x=0;x<expectedCities.size(); x++){
                compareCities(expectedCities.get(x),actualCities.get(x));
            }
        }
    }
    @Test
    public void testSingleCity(){
        String filename="data/cities_test_1.csv";
        HashMap<String, ArrayList<City>> actual=CountriesExample.loadCountries(filename);
        HashMap<String, ArrayList<City>> expected=new HashMap<>();
        expected.put("us",new ArrayList<>(Arrays.asList(
                new City("buffalo","us","NY",279557,
                        new Location(42.8863889,-78.8786111))
        )));
        compareCountryHashMaps(expected,actual);
    }
    @Test
    public void testMultipleCity(){
        String filename="data/cities_test_2.csv";
        HashMap<String, ArrayList<City>> actual=CountriesExample.loadCountries(filename);
        HashMap<String, ArrayList<City>> expected=new HashMap<>();
        expected.put("gi",new ArrayList<>(Arrays.asList(
                new City("gibraltar","gi","00",26544,
                        new Location(36.1333333,-5.35))
        )));
        expected.put("ae",new ArrayList<>(Arrays.asList(
                new City("abu dhabi","ae","01",603687,
                        new Location(24.466667,54.366667)),
                new City("dubai","ae","03",1137376,
                        new Location(25.258172,55.304717)),
                new City("sharjah","ae","06",543942,
                        new Location(25.35731,55.403304))
        )));
        compareCountryHashMaps(expected,actual);
    }
    @Test
    public void testCityRange(){
        String filename="data/cities_test_2.csv";
        HashMap<String, ArrayList<City>> actual=
                CountriesExample.loadCountriesRange(filename,500000,1000000);
        HashMap<String, ArrayList<City>> expected=new HashMap<>();
        expected.put("ae",new ArrayList<>(Arrays.asList(
                new City("abu dhabi","ae","01",603687,
                        new Location(24.466667,54.366667)),
                new City("sharjah","ae","06",543942,
                        new Location(25.35731,55.403304))
        )));
        compareCountryHashMaps(expected,actual);
    }
    /*
    gi,gibraltar,00,26544,36.1333333,-5.35
ae,abu dhabi,01,603687,24.466667,54.366667
ae,dubai,03,1137376,25.258172,55.304717
ae,sharjah,06,543942,25.35731,55.403304
     */
}
