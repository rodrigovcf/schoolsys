package schoolsys;

import java.util.ArrayList;

import schoolsys.concretentities.RegularComp;
import schoolsys.concretentities.ThechnicalComp;
import schoolsys.entities.ComponentType;
import schoolsys.entities.Student;
import schoolsys.entities.Teacher;

public class Program {

	public static void main(String[] args) {				
		
		/*
		 * Simulation 1 - Regular Components
		 */
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Rodrigo");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Amanda");
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Júlia");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);		
		
		RegularComp regular = new RegularComp("English", "Fundamental", students);
		regular.setComponentType(ComponentType.REGULAR);
		
		Teacher teacher1 = new Teacher(1, "Phd. EDUARDO", regular);
		regular.setTeacher(teacher1);
		
		students.get(1).setSc1(10);
		students.get(1).setSc2(7);
		students.get(1).setSc3(8);
		
		double result = regular.returnMedia(
				students.get(1).getSc1(),
				students.get(1).getSc2(), 
				students.get(1).getSc3(),
				"REGULAR"
				);
	
		regular.showAll(regular, 1, result);
			
		/*
		 * Simulation 2 - Thechnical Components
		 */
		
		Student studenThec1 = new Student();
		studenThec1.setId(1);
		studenThec1.setName("Rodrigo");
		
		Student studenThec2 = new Student();
		studenThec2.setId(2);
		studenThec2.setName("Amanda");
		
		ArrayList<Student> thechStudents = new ArrayList<>();
		thechStudents.add(studenThec1);
		thechStudents.add(studenThec2);
		
		ThechnicalComp thechnical = new ThechnicalComp("Computation", "Thechnical", thechStudents);
		thechnical.setComponentType(ComponentType.THECHNICAL);
		
		Teacher teacher2 = new Teacher(2, "Phd. MÔNICA", thechnical);
		thechnical.setArticle(true);
		thechnical.setTeacher(teacher2);
		
		thechStudents.get(1).setSc1(10);
		thechStudents.get(1).setSc2(7);
		thechStudents.get(1).setSc3(8);
		
		double resultThec = thechnical.returnMedia(
				thechStudents.get(1).getSc1(),
				thechStudents.get(1).getSc2(), 
				thechStudents.get(1).getSc3(),
				"THECHNICAL"
				);
		
		thechnical.showAll(thechnical, 1, resultThec);

	}

}
