package booleanTest;

public class BooleanTest {

	public static void main(String[] args) {
		
		// 지역 변수
		boolean isMarried = true;
		System.out.println(isMarried); // true
		
		// 지역 변수 자료형 없이 사용하기 - 추론 가능한 변수에 대한 자료형을 선언하지 않음
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "안녕하세요";
//		str = 3; 타입 추론 시 같은 타입만 할당 가능
		System.out.println(str);
				
	}

}
