package corejava;

class AbstractMyWorkOne extends AbstractMyWork {

	public int Addition(int a1, int a2) {
		return a1+a2;
		
	}
	
	public int Substraction(int a1, int a2) {
		return a1-a2;
		
	}

	public static void main(String[]args) {
		AbstractMyWork ab = new AbstractMyWorkOne();
		
		System.out.println("Addition of The Numbers Are: " + ab.Addition(20,10));
		System.out.println("Substraction of The Numbers Are: " + ab.Substraction(20,10));
	}
	
}
