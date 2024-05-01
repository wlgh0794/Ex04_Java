package chap04_controlstatement;

import java.util.Scanner;

public class _11_Continue02 {

	public static void main(String[] args) {
		
		
		// 3 . 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요
		// ( 단 , 0을 입력하면 종료 )
		// 2 ~ 9 까지의 숫자만 입력할 수 있도록 한다.
		// 다른 숫자를 입력하면 continue를 이용해서 다시 숫자를 입력하도록 한다.
		
		
		Scanner sc = new Scanner( System.in ) ; 
		
		int num ;
		
		while( true )
		{
			
			System.out.println(  "숫자를 입력해주세요 " ) ;
			
			num = sc.nextInt() ;
			
			if ( num == 0 )
			{
				
				System.out.println( "0을 입력하여 프로그램을 종료합니다." );
				
				break ; 
				
			}
			else if ( (  num >= 2 ) && ( num <= 9 ) )
			{
				
				System.out.println( num + "를 입력하셨습니다." );
				
				for ( int i = 1 ; i <= num ; i++ )
				{
					System.out.println( "[ " + i + " 단 ] - 을 출력합니다." );
					
					for ( int j = 1 ; j <= 9 ; j++ )
					{
						System.out.println( i  + " X " + j + " = " + ( i * j )  );
						
					}		
					
				}

			}
			else
			{
				
				System.out.println( "2 ~ 9의 범위를 벗어났습니다." );
				
				continue ;
				
			}
			
		}
		
		sc.close(); // 메모리 초기화
		
		System.out.println( "메모리를 초기화 하였습니다." );
		
		
	}

}
