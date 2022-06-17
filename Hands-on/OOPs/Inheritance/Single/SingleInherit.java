package corejava;

class Employee {
	public void Tejas() {
		System.out.println("TEJAS");
	}
	
}

class Department extends Employee {
	public void SSD() {
		System.out.println("SSD");
	}
	
}

class SingleInherit {

	public static void main(String[] args) {
		Department D= new Department();
		D.Tejas();
		D.SSD();
		D.Tejas();
	}

}
