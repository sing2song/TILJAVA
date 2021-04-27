package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10-a;
		
		System.out.println("some codes....0");
		try {
			int result = (1 + 2 + 3) / b;
			System.out.println(result);
		} catch(ArithmeticException e) {
			// handling exception
			// 1. 사과
			System.out.println("미안합니다...예기치...");
			
			// 2. 로그남기기(파일)
			System.out.println("error:" + e);
			
			// 3. 정상종료
			return;
		} finally {
			// 자원정리
			System.out.println("some codes....1");
		}
		
		System.out.println("some codes....2");

	}

}
