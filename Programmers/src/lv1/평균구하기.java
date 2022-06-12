package lv1;

import java.util.Scanner;

class Solution5{
	public double solution(int[] arr) {
		double answer = 0;
		int sum = 0;
		for(int i : arr) 
			sum += i;
		answer = sum/arr.length;
		return answer;
	}
}
public class Æò±Õ±¸ÇÏ±â {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Solution5 sol = new Solution5();
		
		System.out.println(sol.solution(arr));
		
		
	}

}
