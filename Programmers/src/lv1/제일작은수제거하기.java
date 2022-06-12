package lv1;

import java.util.Arrays;
import java.util.Collections;

class Solution9{
	public int[] solution(int[] arr) {
		
		if(arr.length == 1) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[arr.length-1];
		
		int min = arr[0];
		for(int i : arr) 
			min = Math.min(min, i);
		
		int index = 0;
		for(int i : arr) {
			if(i == min) continue;
			answer[index++] = i;
		}
		
		return answer;

	}
}
public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr1 = {3};
		int[] arr2 = {4,3,2,1};
		
		Solution9 sol = new Solution9();
		int[] answer = sol.solution(arr1);
		System.out.println(Arrays.toString(answer));
		
		answer = sol.solution(arr2);
		System.out.println(Arrays.toString(answer));
	}
}
