package lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution11{
	public long solution(long n) {
		long answer = 0;
		
		String str = Long.toString(n);
		String[] arr = str.split(""); //���ڿ� �ɰ���
		Arrays.sort(arr, Collections.reverseOrder()); //���ڿ� ����
		str = String.join("", arr); //���ڿ� ��ġ��
		answer = Long.parseLong(str); //���ڿ� ���ڷ� ��ȯ
		
		return answer;
	}
}
public class ���������������ι�ġ�ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		Solution11 sol = new Solution11();
		System.out.println(sol.solution(n));

	}
}
