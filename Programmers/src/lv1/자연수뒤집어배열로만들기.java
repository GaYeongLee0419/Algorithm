package lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution12{
	public int[] solution(long n) {
		
		String s = Long.toString(n);
		String arr[] = s.split("");
		int[] answer = new int[s.length()];
		for(int i=0; i<s.length(); i++)
			answer[i] = Integer.valueOf(arr[s.length()-i-1]);
		return answer;
	}
}
public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		Solution12 sol = new Solution12();
		
		System.out.println(Arrays.toString(sol.solution(n)));
	}
}