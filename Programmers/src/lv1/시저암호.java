package lv1;

import java.util.Scanner;

class Solution17{
	public String solution(String s, int n) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isLowerCase(ch)) //�ҹ����� ���
				ch = (char)((ch - 'a' + n) % 26 + 'a');
			else if(Character.isUpperCase(ch)){//�빮���� ���
				ch = (char)((ch - 'A' + n) % 26 + 'A');				
			}
			
			answer += ch;
		}
		return answer;
	}
}
public class ������ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		
		Solution17 sol = new Solution17();
		
		System.out.println(sol.solution(s, n));
		
				
	}

}
