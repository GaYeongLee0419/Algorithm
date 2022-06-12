package lv1;

class Solution7{
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		answer[0] = this.gcd(n, m);
		answer[1] = this.lcm(n, m);
		
		return answer;
	}		
	
	public int gcd(int n, int m) {
		if(m==0) return n;
		return gcd(m, n%m);
	}
	
	public int lcm(int n, int m) {
		return n*m / this.gcd(n, m);
	}
}
public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
