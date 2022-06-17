package corejava;

class SimpleInherit {
	public void print() {
		System.out.println("TEJAS");	
	}
}
class SimpleOne extends SimpleInherit {
	public void show() {
		System.out.println("KUTE");
	}
}

class RunMethod{
	
	public static void main(String[] args) {		
		SimpleOne s= new SimpleOne();
		s.print();
		s.show();
		s.print();
		}
}