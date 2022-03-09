package schoolsys.concretentities;

import java.util.List;

import schoolsys.entities.CurricularComponent;
import schoolsys.entities.Student;

public class ThechnicalComp extends CurricularComponent{

	private boolean article = false;	
	
	public boolean isArticle() {
		return article;
	}

	public void setArticle(boolean article) {
		this.article = article;
	}

	public ThechnicalComp(String componentName, String schoolCurse, List<Student> students) {
		super(componentName, schoolCurse, students);
	}

	@Override
	public void showResult(double finalResult) {
		if (finalResult >= 7.0 && article) {
			System.out.println("Passed in discipline!");
		}else if(finalResult > 7.0 && finalResult > 3.0) {
			System.out.println("Retrieval in discipline!");
		}else
			System.out.println("Disapproved in discipline!");		
	}
	
	@Override
	public void showAll(CurricularComponent cc, int index, double finalResult) {
		System.out.println();
		System.out.println("*** - SHOW ALL - ***");
		System.out.println("Course: " + cc.getSchoolCurse());
		System.out.println("Component: " + cc.getComponentName());
		System.out.println("Teacher: " + cc.getTeacher().getName());
		System.out.println("Student: " + cc.getStudents().get(index).getName());
		System.out.printf("Final Result: %.2f\n", finalResult);
		System.out.println("Article Entregue? " + isArticle());
		showResult(finalResult);
	}

}
