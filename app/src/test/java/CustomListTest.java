import static org.junit.Assert.*;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    public CustomList list;
    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1, list.getCount());
    }
    @Test
    public void testHasCity(){
        list.clear();
        City city = new City("Regina", "Saskatchewan");//add in Regina
        City city1 = new City("Vancouver","BC");//don't add Vancouver for false condition
        list.add(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(city1));
    }
    @Test
    public void testDelete(){
        list.clear();
        City city = new City("Vancouver","BC");
        list.deleteCity(city);
        assertEquals(0,list.getCount());

    }
    @Test
    public void testCountCities(){
        list.clear();
        City city = new City("Vancouver","BC");
        list.add(city);
        int cityNum = list.countCities();
        assertEquals(1,cityNum);
    }
}
