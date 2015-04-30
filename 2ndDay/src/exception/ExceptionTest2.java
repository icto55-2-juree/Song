package exception;

import java.io.IOException;

public class ExceptionTest2 {
public static void main(String[] args) {
	ThrowsText tt = new ThrowsText();
	
	//Unchecked
	//tt.suspiciusMethod2();
	
	try {
		tt.suspiciousMethod3();
	} catch (Exception ex) {
		System.out.println("예외가 발생했습니다."+ex);
	}
	
}
}
