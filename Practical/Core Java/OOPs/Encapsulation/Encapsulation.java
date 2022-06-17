package corejava;

//Java Program To Demonstrate Encapsulation
class Encapsulation {

	//private variables declared
	// these can only be accessed by
	// public methods of class
	private String name;
	private int rollno;
	private int age;

	//get method for name
	public String getName() {
		return name;
	}

	//set method for name
	public void setName(String name) {
		this.name = name;
	}

	//get method for roll no
	public int getRollno() {
		return rollno;
	}

	//set method for roll no
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	//get method for age
	public int getAge() {
		return age;
	}

	//set method for age
	public void setAge(int age) {
		this.age = age;
	}

}

