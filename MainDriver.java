package test06;

public class MainDriver {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		
		b1.setACC_NO("AC123");
		b1.setBal(5000.00);
		b1.setHoldername("Ashish");
		
		System.out.println(b1.getACC_NO());
		System.out.println(b1.getBal());
		System.out.println(b1.getHoldername());
		
		
		Child c1 = new Child();
		c1.showDetails();
		
		Circle ci1 = new Circle();
		ci1.calculateArea();
		
		Rect r1 = new Rect();
		r1.calculateArea();
		
		Calculator cal = new Calculator();
		cal.add(10,20);
		cal.add(12.34,56.78);
		int arr[]= {1,2,3,4,5};
 		cal.add(arr);
 		
	}
}
