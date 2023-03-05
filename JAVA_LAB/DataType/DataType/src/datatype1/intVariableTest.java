package datatype1;

public class intVariableTest {

	public static void main(String[] args) {
		/* 
		1 byte = 8bit
		byte: 8bit 정수형, 범위: -2^7 ~ 2^7 - 1
		byte: 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
		*/ 
		
		byte bs = 127;
		System.out.println(bs);
		
		// byte bs = 128; 
		// Type mismatch: cannot convert from int to byte
		
		// short: 2byte자료형, 정수형,  C/C++ 언어와 호환 시 사용
		
		// int : 자바에서 사용하는 정수에 대한 기본 자료형, 4byte, 프로그램에서 사용하는 모든 숫자(리터럴)은 int로 저장됨
		
		// int num = 12345678900; 
		// The literal 12345678900 of type int is out of range
		// long - 8byte 자료
		// 숫자의 뒤에 알파벳 L 또는 l을 써서 long 형임을 표시함
		long lnum = 12345678900L;
		System.out.println(lnum);
	}
	
	// byte, short, int, long - 1byte, 2byte, 4byte, 8byte
	// float, double - 4byte, 8byte
	// char - 2byte 
	// boolean - 1byte

}