package lv1;

class Solution3{
	public String solution(String phone_number) {
		String answer = "*".repeat(phone_number.length()-4);
		
		answer = answer + phone_number.substring(phone_number.length()-4, phone_number.length());
		
		return answer;
	}
}
public class 핸드폰번호가리기 {

	public static void main(String[] args) {

		String phone_number = "01012341234";
		
		Solution3 sol = new Solution3();
		
		System.out.println(sol.solution(phone_number));

	}

}
