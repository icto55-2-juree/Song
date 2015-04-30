package exception;

public class ExceptionTest {
public static void main(String[] args) {
	try {
		int a = 0;
		double b;
		
		b=100/a; //ArithmaticException 발생
		System.out.println("Some more codes");
		
	} catch (ArithmeticException e) {
		//예외처리
		System.out.println("예기치 못한 오류로 프로그램을 종료합니다."); 
		return;
	}finally{
		System.out.println("자원정리");
	}
}
}
