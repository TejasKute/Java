
package corejava;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class ToySwitchCase 
{
//Creating Multidimensional With String Arrays
String[][] toys = new String[5][5];

//Constructor
ToySwitchCase() 
{
	toys[0][0] = "1";
	toys[0][1] = "Bike";

	toys[1][0] = "2";
	toys[1][1] = "Doremon";

	toys[2][0] = "3";
	toys[2][1] = "Thor";

	toys[3][0] = "4";
	toys[3][1] = "Dr.Strange";

	toys[4][0] = "5";
	toys[4][1] = "Ninja";
}
//Static getToy Method
public static String getToy(int price) 
{
	String toyname;
	switch (price) 
	{
	//Price Of Each Toy In Case
	case 100:
	case 120:
	case 135:
	case 95:
	case 140:
		toyname = "Bike";
		return toyname;

	case 50:
	case 75:
	case 80:
	case 90:
	case 115:
		toyname = "Doremon";
		return toyname;

	case 65:
	case 85:
	case 99:
	case 125:
	case 145:
		toyname = "Thor";
		return toyname;

	case 253:
	case 155:
	case 175:
	case 195:
	case 199:
		toyname = "Dr.Strange";
		return toyname;

	case 201:
	case 122:
	case 144:
	case 166:
	case 91:
		toyname = "Ninja";
		return toyname;

	default:
		toyname = "No Toys Available in this Range";
		return toyname;
	}
}
public static void main(String[] args)
{
	//Creating Scanner Class
	System.out.print("Enter the Price for Toy: ");
	Scanner sc = new Scanner(System.in);
	int price = sc.nextInt();
	System.out.print("Toy in this price: "+ getToy(price)+" Toy");
	sc.close();
	}
}