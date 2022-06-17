package corejava;
	import java.util.List;
	public class StudStud {
		private int id;
		private String name;
		public List<Subject> subjects;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Subject> getSubjects() {
			return subjects;
		}
		public void setSubjects(List<Subject> subjects) {
			this.subjects = subjects;
		}
	}