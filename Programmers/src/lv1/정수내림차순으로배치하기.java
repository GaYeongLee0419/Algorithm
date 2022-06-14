package lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution11{
	public long solution(long n) {
		long answer = 0;
		
		String str = Long.toString(n);
		String[] arr = str.split(""); //문자열 쪼개기
		Arrays.sort(arr, Collections.reverseOrder()); //문자열 정렬
		str = String.join("", arr); //문자열 합치기
		answer = Long.parseLong(str); //문자열 숫자로 변환
		
		return answer;
	}
}
public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		Solution11 sol = new Solution11();
		System.out.println(sol.solution(n));

	}
}
