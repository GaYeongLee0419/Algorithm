package lv1;

class Solution14{
	public String solution(String s) {
		String answer = "";
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			String str = s.substring(i, i+1);

			System.out.printf("cnt : %d , %s\n", cnt, str);
			if(str.equals(" ")) { //�� equals�� �Ǵ��� str == " "�� �ȵǴ���?
				cnt = 0;
				answer += str;
				continue;
			}
			if(cnt%2 == 0) {
				answer += str.toUpperCase();
				cnt++;

			}
			else {
				answer += str.toLowerCase();
				cnt++;
			}
		}
		return answer;
	}
}
public class �̻��ѹ��ڸ���� {

	public static void main(String[] args) {
		String s = "this is me gayeong lee";
		
		Solution14 sol = new Solution14();
		
		System.out.println(sol.solution(s));

	}

}
