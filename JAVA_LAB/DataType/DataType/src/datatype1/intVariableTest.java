package datatype1;

public class intVariableTest {

	public static void main(String[] args) {
		/* 
		1 byte = 8bit
		byte: 8bit 정수형, 범위: -2^7 ~ 2^7 - 1
		byte: 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
		*/ 
		
		byte bs = 127;
		// byte bs = 128; 
		// Type mismatch: cannot convert from int to byte
		
		System.out.println(bs);
		
		// int num = 12345678900; 
		// The literal 12345678900 of type int is out of range
		long lnum = 12345678900L;
		System.out.println(lnum);
	}

}
