package Java_20200519;

public class GarbageCollectorDemo {
	public static void main(String[] args) {
		Admin a1 = new Admin(); // ref count=0이 되어 GC의 후보가 됨.
		a1 = new Admin(); // ref count=0이 되어 GC의 후보가 됨.
		a1 = null;

		a1 = new Admin();
		Admin a2 = a1;
		a1 = null;
		a2 = null; //참조하는게 같으면, 모두 null로 해야 ref count =0 이 됨.
	}
}
