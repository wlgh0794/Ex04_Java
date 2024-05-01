package chap04_controlstatement;

import java.util.Scanner;

public class _08_Break01 {

	public static void main(String[] args) {
	
		// 임포트 명령어 : [ Ctrl + Shift + O ]
		
		// 1 . 사용자가 0을 입력하기 전까지 입력한 모든 정수의 합을 출력
		
		Scanner sc = new Scanner( System.in ) ;
		
		int sum = 0 ;
		
		
		while(true)
		{
		
			System.out.print( "숫자를 입력하세요 . ( 단 , 0을 입력시 종료 )" );
				
			int userNum = sc.nextInt() ;  // 입력받은 값 가져오기
			
			if ( userNum == 0 )
			{
				
				System.out.println( "프로그램을 종료합니다." );
				
				break; 
				
			}
			
			System.out.println( "입력한 숫자 : " + userNum );
			
			sum += userNum;
			
		}
		
		System.out.println( "지금까지 입력한 수의 합은 :" + sum );
		
		sc.close(); // 메모리 해제
		
	}

}
