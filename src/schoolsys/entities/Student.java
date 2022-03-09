package schoolsys.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Student{

	private int id;
	
	private String name;
	private String schoolClass;
	private double sc1, sc2, sc3, score;
	
	
		
	
}
