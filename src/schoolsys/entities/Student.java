package schoolsys.entities;

public class Student{

	private int id;
	private String name;
	private String schoolClass;
	private double sc1, sc2, sc3, average;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolClass() {
		return schoolClass;
	}
	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}
	
	public double getSc1() {
		return sc1;
	}
	public void setSc1(double sc1) {
		this.sc1 = sc1;
	}
	public double getSc2() {
		return sc2;
	}
	public void setSc2(int sc2) {
		this.sc2 = sc2;
	}
	public double getSc3() {
		return sc3;
	}
	public void setSc3(int sc3) {
		this.sc3 = sc3;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolClass == null) ? 0 : schoolClass.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolClass == null) {
			if (other.schoolClass != null)
				return false;
		} else if (!schoolClass.equals(other.schoolClass))
			return false;
		return true;
	}
		
	
}
