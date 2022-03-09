package schoolsys.concretentities;

import java.util.List;

import schoolsys.entities.CurricularComponent;
import schoolsys.entities.Student;

public class RegularComp extends CurricularComponent{

	public RegularComp(String componentName, String schoolCurse, List<Student> students) {
		super(componentName, schoolCurse, students);
		
	}

	@Override
	public void showResult(double finalResult) {
		if (finalResult >= 7.0) {
			System.out.println("Passed in discipline!");
		}else if(finalResult > 7.0 && finalResult > 3.0) {
			System.out.println("Retrieval in discipline!");
		}else
			System.out.println("Disapproved in discipline!");		
	}

}
