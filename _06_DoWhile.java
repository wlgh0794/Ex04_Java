package chap04_controlstatement;

public class _06_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// #########################################################
		
		// 1. do-while : 조건식을 따지기 전에 소스코드를 무조건 1회 실행
//		int i = 0 ;
//		
//		do {
//			System.out.println(  "무조건 1회" );
//		}while( 10 > 5 );
		
	
		// #########################################################
		
		// 2 . 1 ~ 20까지의 정수 중 3의 배수만 출력하는 do-while문을 작성하시오.
		
		int j = 1 ;
		
		do {
			
			if ( j % 3 == 0 )
			{
				System.out.println( j + " →  3의 배수입니다."  );
			}
			
			j++ ;
			
		}while( j <= 20 ) ;
		
		
		// #########################################################
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
