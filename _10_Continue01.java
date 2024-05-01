package chap04_controlstatement;

public class _10_Continue01 {

	public static void main(String[] args) {
		
		
		// for 문에서의 continue : 아래의 코드를 실행하지 않고 증감식으로 이동
		
		for( int i = 0 ; i < 10 ; i++ )
		{
			
			// 0 ~ 4 까지는 출력하지 않고 증감식으로 이동
			
			if ( i < 5 )
			{
				continue ;
			}
			
			System.out.println( i ) ;
			
		}
		
		
		// 2. while 문에서의 Continue : 아래의 코드를 실행하지 않고 조건식으로 이동

		int num = 0 ;
		
		while( num <= 100 )
		{
			++num ;
			
			if ( num % 3 == 0 ) // 3의 배수만 제외하고 출력
			{
				continue ; 
			}

			System.out.println( num ) ;
			
		}
		
	}

}
