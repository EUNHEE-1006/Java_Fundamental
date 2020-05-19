package Java_20200519;

public class CallRefValueDemo {
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 4000;
	}

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 1, 2, 3, 4 };

		System.out.println(i + "," + j[3]);

		//int l = i;
		//l=20;
		
		//int[] k = j;
		//k[3]=4000;
		change(i, j);
		System.out.println(i + "," + j[3]);
		//string class 는 예외로 갔다와도 바뀌지 않아..
		
		int a= 10;
		double b =10.0;
		System.out.println(a==b); //==연산자는 primitive끼리 비교할때는 값비교!!
		
		int[] a1 = {1,2,3,4};
		int[] b1 = {1,2,3,4};
		System.out.println(a1==b1); //==연산자 ref일때는, 두 ref가 같은 객체를 참조하는지를 판단한다.
		//같은 객체를 참조하면, true
		//다른 객체를 참조하면, false
	}
}
