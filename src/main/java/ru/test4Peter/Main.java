package main.java.ru.test4Peter;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {

		String[] arr = { 
				"K1\\SK1", 
				"K1\\SK2", 
				"K1\\SK1\\SSK1", 
				"K1\\SK1\\SSK2", 
				"K2", 
				"K2\\SK1\\SSK1",
				"K2\\SK1\\SSK2" 
				};
		
		
		
		ArrayList<Unit> unit = new DirectoryOfUnits(arr).getUnits();
		Collections.sort(unit);

		//String [] toArray = unit.toArray(new String[unit.size()]);
		//unit.arr
		for (int i = 0; i < unit.size(); i++) {
			System.out.println(unit.get(i));
		}
		
	}

}
