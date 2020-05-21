package Java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		// Wrapper 클래스가 필요한 이유
		ArrayList list = new ArrayList(); // collection= primitive data type 저장 못해
		list.add(new Integer(1));// 모든 primitive data 타입을 객체화 = wrapper
		// list.add(x)

		/*
		 * 자바 1.4이전 버전에서는 primitive date type을 collection에 저장 할 수 없었기 때문에 primitive data
		 * type을 객체화 할 수 있는 wrapper class가 필요함. 아래와 같이 1을 추가할 수 없음. Collection에 1을 저장하기
		 * 위해서는 primitive data type을 객체화 하는 Integer 클래스로 변환해야 함.
		 */

		/*
		 * 목적!!!!! 1. primitive date를 wrapper로 어떻게 (new Integer(1)) 2. wrapper를
		 * primitive로 어떻게 (intValue()) 3. string => primitive data type
		 * (Integer.parseInt) 4. primitive data type => String
		 */

		Integer i1 = new Integer(1); // 1
		Integer i2 = new Integer(2); // 1
		int i3 = i1.intValue() + i2.intValue(); // 2

		String s1 = "10";
		String s2 = "20";
		int s3 = Integer.parseInt(s1) + Integer.parseInt(s2); // 3
		// int s4 = s1+s2; // +는 연결연산자가 되어 1020이 됨.

		String s4 = 10 + ""; // primitive 가 문자열 만나서 자동 캐스팅 됨, 이렇게 쓰지 말자
		String s4 = String.valueOf(10); // 이렇게 쓰자!!!!!!

		// Auto-Boxing : primitive data type => wrapper class
		Integer i5 = 10;
		Integer i6 = 20;

		// Auto-unBoxing : wrapper => primitive data type
		int i7 = i5 + i6;

	}

}
