package corejava;
	public class StudOne {
		public static void main(String[] args) {
			Stud student = new Stud();
			String[] subjects = { "English", "Science", "Computer" };
			// setting bean values
			student.setId(183143);
			student.setName("TEJAS");
			student.setSubjects(subjects);
			
			// getting bean value
			System.out.println("Student Id : " + student.getId());
			System.out.println("Student name : " + student.getName());
			String[] subjectArray = student.getSubjects();
		for (int i = 0; i < subjectArray.length; i++) {
			System.out.println("Student subject " + (i + 1) + " : " + subjectArray[i]);
			}
		}
	}
