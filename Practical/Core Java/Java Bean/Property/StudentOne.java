package corejava;

	public class StudentOne {
		public static void main(String[] args) {
			
			Student student = new Student();
			
			//setting bean values
			student.setId(183143);
			student.setName("TEJAS");
			student.setActive(true);
			
			//getting bean value
			System.out.println("Student Id : "+student.getId());
			System.out.println("Student name : "+student.getName());
			System.out.println("Student active : "+student.isActive());
		}
	}
