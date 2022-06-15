package lv1;

import java.util.Scanner;

class Solution13{
	public int solution(int n) {
		int answer = 0;
		
		while(n>0) {
			answer += n%10;
			n /= 10;
		}
		
		return answer;
	}
}
public class 자릿수더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Solution13 sol = new Solution13();
		
		System.out.println(sol.solution(n));

	}

}
