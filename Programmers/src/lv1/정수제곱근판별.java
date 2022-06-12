package lv1;

import java.util.Scanner;

class Solution10{
	public long solution(long n) {
		long answer = (long)Math.sqrt(n);
		
		if(Math.pow(answer, 2) == n) return (long) Math.pow(answer+1, 2);
		else return -1;
	}
}
public class 정수제곱근판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		Solution10 sol = new Solution10();
		
		long answer = sol.solution(n);
		
		System.out.println(answer);

	}

}
