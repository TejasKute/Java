package corejava;

class EncapsulateMyWork {

	public static void main(String[] args) {
		EncapsulationMyWork en = new EncapsulationMyWork();
		
		en.setId(183143);
		en.setName("TEJAS");
		en.setAddress("GHATKOPAR, MUMBAI");
		
		System.out.println("Id: "+ en.getId());
		System.out.println("Name: "+ en.getName());
		System.out.println("Address: "+ en.getAddress());

	}

}
