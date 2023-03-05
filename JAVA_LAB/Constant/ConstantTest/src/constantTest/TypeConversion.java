package constantTest;

public class TypeConversion {

	public static void main(String[] args) {

		//Type Conversion - 형 변환
		
		// 묵시적 형 변환
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		// 명시적 형 변환
		int iNum2 = 10000;
		byte bNum1 = (byte)iNum2; // 강제로 형을 변환해 크키가 작은 데이터라 값이 이상해 짐 
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		
		System.out.println(bNum1); // 16 - 주의 필요
		System.out.println(iNum3); // 3
		
		// 연산 중 형 변환
		double dNum10 = 1.2;
		float fNum10 = 0.9f;
		
//		int iNum10 = dNum10 + fNum10;
		int iNum10 = (int)dNum10 + (int)fNum10;
		int iNum11 = (int)(dNum10 + fNum10);
		
		System.out.println(iNum10); // (int)1 + (int)0 = 1
		System.out.println(iNum11); // (int)(1.2 + 0.9) = 2 
	}

}
