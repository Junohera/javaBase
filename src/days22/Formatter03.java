package days22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * #parse #exception
 */
public class Formatter03 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		Scanner sc = new Scanner(System.in);
		Date inDate = null;
		System.out.print("날짜를 예와 같이 입력해주세요.(입력예: 2015/12/31) : ");
		
		// 입력처리 
		while (true) {
			try {
				inDate = sdf.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				System.out.print("유효형식(yyyy/mm/dd) : ");
			}
		}
		System.out.println(sdf2.format(inDate));
		System.out.println("정상적으로 입력되었습니다.");
	}
}
