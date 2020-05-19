package Java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo(){ //컴파일러가 디폴트 생성자를 만들때는 클래스 접근한정자를 따라 만듬
		super();
	}
}
class A extends Object{ //부모클래스는 무조건 디폴트를 만들고 시작해!!!!
	A(int a){
		super();
	}
	A(){
		super();
	}
}

class B extends A{
	B(){
		super(); //부모 클래스의 디폴트생성자로 가라, 근데 디폴트 생성자가 없으니 오류. 
		//컴파일러가 원래 자동으로 만들어주는데, 생성자가 있으면 안만들어주니까. 직접 만들어줘야 함!!!
	}
}
/*class A{
	A(){
		super();
	}
}

class B extends A{
	B(){
		super();
	}*/
