package Java_20200514;

public class TwoArray {
	public static void main(String[] args) {

		// 1.배열 선언 및 생성
		/*int[][] a = new int[3][2];

		// 2. 배열 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;

		int[][] b = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		// 3차원 배열 ???
		
		// 3. 배열 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] );
			}
			System.out.println();
			
		}*/
		
		//4/ 배열 동적할당
		int [][] c =new int[3][];
		
		c[0]=new int[1];
		c[1]=new int [2];
		c[2]=new int[3];
		
		c[0][0]=45;
		c[1][0]=55;
		c[1][1]=56;
		c[2][0]=65;
		c[2][1]=66;
		c[2][2]=67;
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("%d ", c[i][j]);
			}
		}
		System.out.println();
		for(int[]value: c) {
			for(int d:value) {
			System.out.println(d);
			}
		}
		
	}
}
