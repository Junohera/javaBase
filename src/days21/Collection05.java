package days21;

import java.util.ArrayList;

/*
 * Collection framework의 저장 방식
 * 일반적으로 Collection Class의 Object에는 프로그램에서 처리운영되는 데이터를 저장하게 됩니다.
 * 여러타입이 혼용되어 저장이 가능하지만, 실제로 혼용되어 저장되는 경우는 거의 없습니다.
 * Collection Class의 입력, 반환에  관련한 모든 메서드들은 Object 타입을 기반으로 하기때문에
 * 컬렉션에서 데이터 인출(.get()) 시에 강제 형변환을 해야하는 불편함이 존재합니다.
 * 이러한 문제점을 해결하기위해 JDK 1.5 이후에는 제네릭 문법을 지원합니다.
 */

/*
 * 제네릭 문법을 사용하지 않은 ArrayList의 사용
 * ArrayList a = new ArrayList();
 * a.add(100);
 * Integer i = (Integer)a.get(0); // 다시 꺼내어 쓸때 강제 형변환이 반드시 필요
 */

/*
 * 제네릭 문법을 사용할 경우.
 * ArrayList<Integer> a = new ArrayList<Integer>();
 * new 다음의 클래스명에서는 제네릭 타입을 생략할 수 있음.
 * ArrayList<Integer> a = new ArrayList<>();
 * a.add(100);
 * Integer i = a.get(0);
 */

/*
 * 제네릭 문법
 * 동일한 이름의 클래스지만
 * 객체 생성 시점에 ... 자료형을 지정하여 서로 다른 자료형을 지원하는 클래스를 생성할 수 있는 문법
 * (메서드 오버로딩과 유사한 방법)
 */
public class Collection05 {
	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<>();
		// 제네릭을 쉽게 설명하면 ... ArrayList에 저장될 자료형을 결정짓는 결정자라고 표현합니다.
		// 제네릭 타입이 지정된 컬렉션 객체의 Object타입을 받는 메서드들은
		// 해당 자료형을 처리할 수 있는 입력/반환 메서드로 변경됩니다.
		a.add(10);
		int i0 = a.get(0);
		// a.add(1.1); X
		// a.add("Hello"); X
		System.out.printf("i0 -> %d\n", i0);
	}
}
