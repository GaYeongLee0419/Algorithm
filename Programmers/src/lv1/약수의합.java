package lv1;

import java.util.Scanner;

class Solution15{
	public int solution(int n) {
		int answer = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) answer += i;
		}
		return answer;
	}
}
public class 약수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Solution15 sol = new Solution15();
		
		System.out.println(sol.solution(n));
	}

}
