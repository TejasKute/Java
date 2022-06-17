package corejava;

public class TypeCastingWidening {

	public static void main(String[] args) {
		
		int i = 500;
		
		//Automatic conversion
		
		long l = i ;
		
		//Automatic conversion
		
		float f = l ;
		
		System.out.println("Int variable i = " + i);
		System.out.println("Long variable l = " + l);
		System.out.println("Float variable f = " + f);

	}

}