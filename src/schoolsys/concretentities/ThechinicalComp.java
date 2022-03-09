package schoolsys.concretentities;

import java.util.List;

import schoolsys.entities.CurricularComponent;
import schoolsys.entities.Student;

public class ThechinicalComp extends CurricularComponent{

	private boolean article = false;	
	
	public boolean isArticle() {
		return article;
	}

	public void setArticle(boolean article) {
		this.article = article;
	}

	public ThechinicalComp(String componentName, String schoolCurse, List<Student> students) {
		super(componentName, schoolCurse, students);
		// TODO Auto-generated constructor stub
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

}
