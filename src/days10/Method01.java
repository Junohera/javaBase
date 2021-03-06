package days10;

public class Method01 {
	/*
	 * Method : Function 이라고도 부르며, 간헐적으로 반복되는 코드단위를 별도로 정의하고
	 * 그 이름 불러서 코드를 실행하는 단위코드.
	 * Java에서는 Function이라는 말보다 Method라는 표현을 주로 사용합니다.
	 * 
	 * 특징
	 * 1. 명령들이 모여서 기능을 정의하는 단위.
	 * 2. 일련의 실행코드들을 묶어서 재활용
	 * 3. method의 생성 : 반드시 클래스의 내부에서만 선언할 수 있습니다.
	 * 4. method는 선언된 이후, method를 이름으로 호출해야만 method의 실행코드들이 실행됩니다.
	 * 5. 각 method는 고유한 기능이 있고, 고유한 이름이 있으며, 항상 고유한 이름 옆에 괄호를 달고 나옵니다. 
	 */
	// 함수의 실행을 명령한다는 것을 이제부터 그 함수(method)를 호출한다 라고 표현합니다.
	// main method는 프로그램 시작과 동시에 자동 호출 되는 method입니다.
	public static void main(String[] args) {
		System.out.println("프로그램 시작"); // 1번
		myPrint(); // 이름으로 호출(Call)되어야 실행 // 2번
		System.out.println("프로그램 종료"); // 3번
		
		// method가 호출되면, 해당 method의 실행코드가 실행됩니다.
		// method가 호출되면, 실행의 흐름이 현재 method에서 호출한 method로 이동됩니다.
		// 해당 method의 실행이 종료된 이후 method를 호출한 시점으로 돌아오게 됩니다.
	}
	// 아래와 같은 사용자가 생성한 method는 이외의 영역에서 코드로 직접 호출해야 실행됩니다.
	public static void myPrint() { // 2번
		System.out.println("내가 만든 Print method 실행~~!!");
		System.out.println("내가 만든 Print method 실행~~!!");
		System.out.println("내가 만든 Print method 실행~~!!");
	}
	// method사용의 첫번째 이유
	// 간헐적으로 반복되는 명령 집합을 method로 정의해놓고, 필요할때 마다 이름을 불러서 사용하기 위함입니다.
}
