package schoolsys.entities;

import java.util.List;

import interfaceactions.ICurricularComp;

public abstract class CurricularComponent implements ICurricularComp{	
			
	private ComponentType componentType;
	
	private String componentName;
	private String schoolCurse;
	private Teacher teacher;
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
	
	public ComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(ComponentType componentType) {
		this.componentType = componentType;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public double returnMedia(double sc1, double sc2, double sc3, String componentType) {
		
		setComponentType(ComponentType.valueOf(componentType));
		
		if(getComponentType().equals(ComponentType.REGULAR)) {
			return (sc1 + sc2 + sc3)/3;
		}else if(getComponentType().equals(ComponentType.THECHNICAL)) {
			return ((sc1 * 0.6) + (sc2 * 0.5) + (sc3 * 0.4))/3;
		}else
			return 0;
	}
	
	public abstract void showResult(double finalResult);
	
	public abstract void showAll(CurricularComponent cc, int index, double finalResult);
			
}
