package schoolsys.entities;

import java.util.List;

public class CurricularComponent {	
	
	private String componentName;
	private String schoolCurse;
	private List<Student> students;
			
	public CurricularComponent(String componentName, String schoolCurse, List<Student> students) {
		super();
		this.componentName = componentName;
		this.schoolCurse = schoolCurse;
		this.students = students;
	}
	
	public String getComponentName() {
		return componentName;
	}
	
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	
	public String getSchoolCurse() {
		return schoolCurse;
	}
	
	public void setSchoolCurse(String schoolCurse) {
		this.schoolCurse = schoolCurse;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
