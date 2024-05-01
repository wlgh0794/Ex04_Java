package chap04_controlstatement;

public class _07_DuplicateFor {

	public static void main(String[] args) {
		
		// #######################################
		
		// 1 . 중첩 For문
		
		for ( int i = 0 ; i < 5 ; i++ )
		{
			
			for ( int j = 0 ; j < 5 ; j++ )
			{
				
				System.out.println( "i : " + i + " / j : " + j  );
				
			}	
			
			System.out.println( "i 값 증가" );
		}
		
		// #######################################
		
		// 2. 2 ~ 9 까지 구구단 출력
		
		for ( int i = 2 ; i <= 9 ; i++ )
		{
			
			System.out.println("[ 구구단 → " + i + "단 ]" );
			
			for ( int j = 1 ; j <=9 ; j++ )
			{
				System.out.println( i + " *  " + j + " =  " + ( i * j ) );
				
			}
			
		}
		
		// #######################################
		
		// 3 . [ 문제 ]
		
		// *****		
		// *****		
		// *****		
		// *****		
		// *****
		// 를 출력하시오
		
		for ( int i = 1 ; i <= 5 ; i++  )
		{
			for ( int j = 1 ; j <= 5 ; j++ )
			{
				System.out.print( "*" );
			}	
			System.out.println("");
		}
		
			
		// #######################################
		
		
		// 4 . AB + BA = 99를 만족하는 A , B 값을 모두 출력하는 중첩 For문을 작성하시오
		// 단 , ( A , B 는 0 ~ 9 까지의 정수 )
		
		int sum ;
		
		int count = 0 ;
		
		int result1 ;		
		int result2 ;
		
		for ( int A = 0 ; A <= 9 ; A++ ) 
		{
			
			for ( int B = 0 ; B <= 9 ; B++ ) 
			{
				
				result1 = ( ( A * 10 ) + B ) ; 
				
				result2 = ( ( B * 10 ) + A ) ; 
				
				sum = result1 + result2 ;
				
				if ( sum == 99 )
				{
					System.out.println( "▶ A : " + A + "  / B" + " : " + B );
					
					System.out.println( "▶ AB : " + result1 + " / BA : " + result2 );
										
					System.out.println( "[결과] : " + sum + "\n");
					
					count++ ;
				}
				
			}			
	
		}
		
		System.out.println( "조건이 성립한 횟수 =  " + count  + "회" );
				
		
	// #######################################
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
