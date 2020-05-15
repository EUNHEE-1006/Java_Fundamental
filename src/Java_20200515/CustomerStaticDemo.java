package Java_20200515;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name="박은희";
		c1.interestRate=30.45;
		
		Customer c2 = new Customer();
		c2.name="박준형";
		c2.interestRate=10.26;
		
		System.out.println(c1.interestRate);
	}
}
