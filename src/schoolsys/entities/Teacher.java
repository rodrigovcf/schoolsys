package schoolsys.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Teacher {

	private int id;
	private String name;
	private CurricularComponent component;
	
	public Teacher(int id, String name, CurricularComponent component) {
		super();
		this.id = id;
		this.name = name;
		this.component = component;
	}
	
}
