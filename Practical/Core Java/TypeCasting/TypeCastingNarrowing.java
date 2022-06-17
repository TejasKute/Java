package corejava;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		
		
		double d = 145.168;
		
	// Explicit conversion
		
		long l = (long) d ;
		
		// Explicit conversion
		
		int i = (int) l ;
		
		System.out.println("Double data type value : " + d );
		System.out.println("Long data type value : " + l );
		System.out.println("Integer data type value : " + i );

	}
}