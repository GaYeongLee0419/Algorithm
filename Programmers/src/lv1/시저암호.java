package lv1;

import java.util.Scanner;

class Solution17{
	public String solution(String s, int n) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isLowerCase(ch)) //소문자인 경우
				ch = (char)((ch - 'a' + n) % 26 + 'a');
			else if(Character.isUpperCase(ch)){//대문자인 경우
				ch = (char)((ch - 'A' + n) % 26 + 'A');				
			}
			
			answer += ch;
		}
		return answer;
	}
}
public class 시저암호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		
		Solution17 sol = new Solution17();
		
		System.out.println(sol.solution(s, n));
		
				
	}

}
