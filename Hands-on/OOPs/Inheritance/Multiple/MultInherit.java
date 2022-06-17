package corejava;

class Employe {
	public void Tejas() {
		System.out.println("TEJAS");
	}
	
}

class Departments extends Employe {
	public void SSD() {
		System.out.println("SSD");
	}
	
}

class State extends Departments {
	public void mh() {
		System.out.println("MAHARASHTRA");
	}
	
}

class MultInherit {

	public static void main(String[] args) {
		State D= new State();
		D.Tejas();
		D.SSD();
		D.mh();
	}

}