package main.java.ru.test4Peter;

import java.util.ArrayList;

public class DirectoryOfUnits {
	ArrayList<Unit> units;

	public static String[] unitsToStrings(ArrayList<Unit> unit) {
		String[] tmp = new String[unit.size()];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = unit.get(i).toString();
		}
		return tmp;
	}

	public DirectoryOfUnits(String[] str) {
		units = new ArrayList<Unit>();

		for (int i = 0; i < str.length; i++) {
			String[] substr = str[i].split("\\D+");
			Unit tmp = new Unit();

			if (substr.length == 4) {
				tmp.setDepartment(Integer.parseInt(substr[1]));
				if (!units.contains(tmp)) {
					units.add(new Unit(tmp));
				}
				tmp.setService(Integer.parseInt(substr[2]));
				if (!units.contains(tmp)) {
					units.add(new Unit(tmp));
				}
				tmp.setGroup(Integer.parseInt(substr[3]));
				if (!units.contains(tmp)) {
					units.add(new Unit(tmp));
				}

			} else if (substr.length == 3) {
				tmp.setDepartment(Integer.parseInt(substr[1]));
				if (!units.contains(tmp)) {
					units.add(new Unit(tmp));
				}
				tmp.setService(Integer.parseInt(substr[2]));
				if (!units.contains(tmp)) {
					units.add(new Unit(tmp));
				}

			} else if (substr.length == 2) {
				tmp.setDepartment(Integer.parseInt(substr[1]));
				if (!units.contains(tmp)) {
					units.add(new Unit(tmp));
				}
			}
		}

	}

	public ArrayList<Unit> getUnits() {
		return units;
	}

}
