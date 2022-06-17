package lv1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution16{
	public int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i< numbers.length; i++) {
			for(int j=i; j < numbers.length; j++) {
				if(list.contains(numbers[i] + numbers[j]))
					continue;
				list.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = list.stream()
						.mapToInt(Integer::intValue)
						.toArray();
		Arrays.sort(answer);
		return answer;
		}
	}
public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
