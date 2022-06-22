package JuPractical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTestSuccess {

	@Test
	public void Addtest()
	{
		//Creating a Object of Class
		MyJUnitClass mju = new MyJUnitClass();
		int result = mju.add(20,30);
		assertEquals (50, result);
	}

}
