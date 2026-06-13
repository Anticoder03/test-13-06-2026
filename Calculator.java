package test06;

public class Calculator {
	 public void add(int a ,int b) {
		 System.out.println(a+b);
	 }
	 public void add(double a ,double b) {
		 System.out.println(a+b);
	 }
	 public void add(int a[]) {
		 int sum = 0;
		 for (int num:a) {
			 sum += num;
		 }
		 System.out.println(sum);
	 }
}
