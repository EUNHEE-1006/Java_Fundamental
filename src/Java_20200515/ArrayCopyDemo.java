package Java_Fundamental;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "watermelon", "blueberry" };

		String[] temp = new String[6];

		// fruits => 원본배열
		// 0 =>원본배열의 위치
		// temp => 복사할 배열
		// 2 => 붙혀 넣을 위치
		// 4 => 복사할 갯수
		System.arraycopy(fruits, 0, temp, 2, 4);

		temp[0] = "peach";
		temp[1] = "pear";

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		for (String value : temp) {
			System.out.print(value);
		}
	}
}
