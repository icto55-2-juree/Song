package exception;

import java.io.IOException;

public class ThrowsText {
public void suspiciousMethod() throws IOException{
	throw new IOException(); //강제로 예외 발생
}
public void suspiciousMethod2(){
	throw new ArithmeticException();  //강제로 예외 발생
}

public void suspiciousMethod3() throws DivideByZeroException{
	throw new DivideByZeroException("0으로 나누지 마세요");
}



}
