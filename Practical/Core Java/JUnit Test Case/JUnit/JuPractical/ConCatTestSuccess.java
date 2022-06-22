package JuPractical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTestSuccess {

	@Test
	public void Concattest()
	{
		//Creating a Object of Class
		MyJUnitClass mju = new MyJUnitClass();
		String result = mju.ConCat("JAI HIND,"," JAI MAHARASHTRA");
		assertEquals ("JAI HIND, JAI MAHARASHTRA", result);
	}

}
