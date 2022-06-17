package corejava;
import java.util.ArrayList;
import java.util.List;
	class StudentStudOne {
		
	public static void main(String[] args) {
		StudentStud student = new StudentStud();

		List<String> subjects = new ArrayList<String>();
		subjects.add("English");
		subjects.add("Science");
		subjects.add("Computer");
			// setting bean values
			student.setId(101);
			student.setName("TEJAS");
			student.setSubjects(subjects);
			
			// getting bean value
			System.out.println("Student Id : " + student.getId());
			System.out.println("Student name : " + student.getName());
			List<String> subjectList = student.getSubjects();
				for (int i = 0; i < subjectList.size(); i++) {
					System.out.println("Student subject " + (i + 1) + " : " + subjectList.get(i));
				}
		}
	}
