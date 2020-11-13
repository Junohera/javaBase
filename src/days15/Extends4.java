package days15;
/*
 * 일반 객체의 생성과정
 * 1. 멤버 필드 메모리 로딩
 * 2. 생성자 호출
 * 
 * 상속관계에서의 객체 생성과정
 * 1. 멤버 필드 메모리 로딩 - 부모/자식 클래스의 모든 멤버필드가 메모리 로딩
 * 2. 생성자 호출(먼저 자식 클래스의 생성자 호출)
 * 3. 자식 클래스 생성자의 첫 번째 실행 코드인 super()에 의해 부모클래스의 생성자 호출
 * 		super()라는 명령은 따로 쓰지않아도 이미 존재하며 부모 클래스가 있다면 자동 호출되는 명령.
 * 4. 자식 클래스의 생성자의 나머지 코드들 실행
 *  	부모클래스의 private 멤버와 같은 경우 자식클래스에서 초기화를 할 수 없기 때문에
 *  	부모클래스의 생성자를 통해 초기화를 실행 
 */
class SuperB {
	int superNum;
	public SuperB() {
		System.out.println("부모클래스의 생성자 실행");
	} // 부모 클래스 생성자
}

class SubB extends SuperB { // SuperB 클래스 상속
	int subNum;
	public SubB() {
//		super(); 굳이 쓰지않아도 내부적으로 디폴트생성자를 호출
		/*
		 * 자식 클래스에서 부모클래스 생성자 호출은 super(); 라고 명령하며, 반드시 첫번째 실행코드로 씁니다
		 * 다만 부모 클래스의 생성자가 오버로딩 되거나 하지 않았다면 쓰지 않아도 super(); 명령은 실행됩니다.
		 * 부모 클래스 생성자가 디폴트생성자만 있을시 super(); 명령 생략 - 자동 호출
		 */
		System.out.println("SubB() 자식클래스의 생성자 실행");
		// 만약 부모클래스의 디폴트 생성자가 없는 상태라면, 현재 존재하는 생성자 형식으로 super()의 호출을 맞춰야합니다. 
		// 또 만약 그럴수 없는 상태라면 호출하는 형식의 생성자를 부모 클래스에 만들어줘야합니다.
		
	} // 자식 클래스 생성자
	public SubB(int subNum) { // 오버로딩 된 자식 클래스 생성자
		// 자식 클래스의 오버로딩된 생성자에서도 기본적으로 super()가 내부적으로 호출됩니다.
		// 다만 개발자가 필요에 의해 this()라고 쓰고 형제 생성자를 호출한다면, 
		// super()의 호출의 권한은 this()에 의해 호출된 형제생성자에게 일임됩니다.
		// 따라서 super(), this()는 같이 쓸 수 없습니다.
		this();
		System.out.println("SubB(int subNum)자식클래스의 오버로딩된 생성자 실행");
		// 부모나 형제 생성자에 매개변수가 있는 경우 반드시
		// 호출하려는 super() 또는 this()의 매개변수에 맞춰 전달인수를 전달합니다.
	}
}
public class Extends4 {
	public static void main(String[] args) {
		SubB b = new SubB();
		System.out.println();
		SubB c = new SubB(20);
	}
}
