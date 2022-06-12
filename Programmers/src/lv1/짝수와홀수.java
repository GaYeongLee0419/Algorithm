package lv1;

import java.util.Scanner;

class Solution8{
	public String solution(int num) {
		String answer = "";
		if(num%2 == 0) answer = "Even";
		else answer = "Odd";
		return answer;
	}
}
public class Â¦¼ö¿ÍÈ¦¼ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		Solution8 sol = new Solution8();
		
		System.out.println(sol.solution(num));

	}

}
