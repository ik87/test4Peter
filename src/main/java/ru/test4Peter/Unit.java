package main.java.ru.test4Peter;

//департамент K1 включает в себя службу SK1, включающую в себя отдел SSK1
public class Unit implements Comparable<Unit> {
	private int department; // K1
	private int service; // SK2
	private int group; // SK3

	public Unit() {
		department = 0;
		service = 0;
		group = 0;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public Unit(Unit u) {
		department = u.department;
		service = u.service;
		group = u.group;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (group != 0) {
			return "K" + department + "\\SK" + service + "\\SSK" + group;
		} else if (service != 0) {
			return "K" + department + "\\SK" + service;
		} else {
			return "K" + department;
		}

	}

	@Override
	public boolean equals(Object o) {
		Unit x = (Unit) o;
		if (x.department == department && x.service == service && x.group == group)
			return true;
		return false;
	}

	@Override
	public int compareTo(Unit o) {
		if (department == o.department) {
			if (service == o.service) {
				return group - o.group;
			} else {
				return service - o.service;
			}
		}
		return department - o.department;
	}

}
