package chap04_controlstatement;

import java.util.Scanner;

public class _09_Break02 {

	public static void main(String[] args) {
		
		
		// #################################################
		
		// 2 . 사용자가 입력한 숫자 단까지 구구단을출력하는 프로그램을 작성하시오.
		
		// 임포트 명령어 : [ Ctrl + Shift + O ]
		
		Scanner sc = new Scanner( System.in ) ;
		
		int num = 0 ;
		
		while( true )
		{
	
			System.out.println( "몇 단까지 구구단을 출력할까요?" ) ;
			
			num = sc.nextInt() ;
			
			if ( num == 0 )
			{
				System.out.println( "0을 입력되어 프로그램을 종료합니다" ) ;
				
				break ;
			}
			
			for( int i = 1 ; i <= num ; i++ )
			{
				
				System.out.println( " [ " + i + "단 ] 을 출력합니다. " ) ;
				
				for( int k = 1 ; k <= 9 ; k++ )
				{
					
					System.out.println( i +  " X " + k  + " =  " + ( i * k ) ) ;
					
					if ( k >= 3 )
					{
						break ;
					}
					
				}
				
				System.out.println( "\n" ) ;
			
			}		
			
		}
		
		sc.close(); // 메모리 해제
		
		
		// #################################################
		
	}

}
