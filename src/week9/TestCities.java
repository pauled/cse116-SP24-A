package week9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;
public class TestCities {
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
}
