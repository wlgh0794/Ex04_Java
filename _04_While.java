package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		
		// ############################################
		
		// 1. 1 ~ 100까지의합
		
		int num = 1 ;
		int sum = 0 ;
		
		while( num <= 100 )
		{
			sum += num++;
		}
		
		System.out.println( "1~100까지의 합 : " + sum );
		
		// ############################################
		
		// [While] 문을 이용해서 1 ~ 10까지 거꾸로 출력하세요.
		
		num = 10 ;

		while( num >= 1 )
		{
			System.out.println(" num 값 : " + num-- );
		}
				
		// ############################################
		
		// [for문] 문을 이용해서 1 ~ 10까지 거꾸로 출력하세요.
			
		for ( int i = 10 ; i > 0 ; i-- )
		{
			System.out.println(" i 값 : " + i );	
		}

		// ############################################
		
		
		
		
		
		
	}

}
