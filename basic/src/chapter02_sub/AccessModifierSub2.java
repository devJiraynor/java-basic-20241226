package chapter02_sub;

//import chapter02.*;
// chapter02 package에 선언된 F_AccessModifier 클래스를
// 사용하기 위해 import 
import chapter02.F_AccessModifier;
// public으로 지정되어 있지 않은 클래스는 import가 불가능
// import chapter02.AccessModifierSub1;

public class AccessModifierSub2 extends F_AccessModifier {

	void method() {
		// 현재 위치 : 다른 패키지의 상속받은 하위 클래스
		// public, protected 접근 제어자는 접근 가능
		super.publicInt = 0;
		super.protectedInt = 0;
		// package, private 접근 제어자는 접근 불가능
		super.packageInt = 0;
		super.privateInt = 0;
	}
	
}


