package Java_20200518;

public class VarArgDemo {
	
	public void print(int... a) {
		//a 변수는 배열로 처리
		int length = a.length;
		
		for(int temp : a) {
			System.out.printf("%d ",temp);
			
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
			VarArgDemo v1=new VarArgDemo();
			v1.print(1);
			v1.print(10,20);
			v1.print(100,200,300);
		}
}
