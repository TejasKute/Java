package corejava;

public class TestDriverFive
	{ 
	public static void main ( String [] args ) 
		{ 
			int [] intArr = new int [5]; 
		for (int i = 0; i < intArr . length ; i ++) 
			{
				intArr [ i ] = i * 2;
			}
		for (int i = 0; i < intArr . length ; i ++) 
			{ 
				System.out.print( intArr [ i ] + ", ") ;
			}
		} 
	}
