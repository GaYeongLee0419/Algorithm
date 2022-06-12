package lv1;

import java.util.Scanner;

//���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
//���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
//�ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
class Solution4{
	public boolean solution(int x) {
		boolean answer = true;
		
		int sum = 0;
		int temp = x;
		while(temp > 0) {
			sum += temp % 10;
			temp /= 10;
			System.out.printf("sum = %d, temp = %d\n", sum, temp);
		}
		
		if(x%sum != 0) answer = false;
		return answer;
	}
	
}
public class �ϻ���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		Solution4 sol = new Solution4();
		boolean answer = sol.solution(x);
		
		System.out.println(answer);

	}

}
