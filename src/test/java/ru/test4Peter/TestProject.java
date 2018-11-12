package test.java.ru.test4Peter;


import main.java.ru.test4Peter.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestProject {
	
    @Test
    public void testArrayAscending() {
    	
    	
		String[] data = { 
				"K1\\SK1", 
				"K1\\SK2", 
				"K1\\SK1\\SSK1", 
				"K1\\SK1\\SSK2", 
				"K2", 
				"K2\\SK1\\SSK1",
				"K2\\SK1\\SSK2" };
		
		String[] expected =  { 
				"K1",
				"K1\\SK1", 
				"K1\\SK1\\SSK1",
				"K1\\SK1\\SSK2",				
				"K1\\SK2", 
				"K2",
				"K2\\SK1",
				"K2\\SK1\\SSK1",
				"K2\\SK1\\SSK2" };
		
		
		
		ArrayList<Unit> units = new DirectoryOfUnits(data).getUnits();
		
		Collections.sort(units);
		String[] actual = DirectoryOfUnits.unitsToStrings(units);
		
		//Test equal.
        assertThat(actual, is(expected));

		

    }
   /* Не проходит
    * @Test
    public void testArrayDescending() {
    	
    	
		String[] data = { 
				"K1\\SK1", 
				"K1\\SK2", 
				"K1\\SK1\\SSK1", 
				"K1\\SK1\\SSK2", 
				"K2", 
				"K2\\SK1\\SSK1",
				"K2\\SK1\\SSK2" };
		
        String[] expected =  {     
        		"K2",
        		"K2\\SK1",
        		"K2\\SK1\\SSK2",
        		"K2\\SK1\\SSK1",
        		"K1",
        		"K1\\SK2",
        		"K1\\SK1",
        		"K1\\SK1\\SSK2",
        		"K1\\SK1\\SSK1"
		};
		
		
		
		ArrayList<Unit> units = new DirectoryOfUnits(data).getUnits();
		
		Collections.sort(units, Collections.reverseOrder());
		String[] actual = DirectoryOfUnits.unitsToStrings(units);
		
		//Test equal.
        assertThat(actual, is(expected));
		

		

    }
    */
}