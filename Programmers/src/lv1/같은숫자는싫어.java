class Solution29{
    public int solution(int n){
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n%i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        int n = 12;
        Solution29 sol = new Solution29();
        System.out.println(sol.solution(n));
    }
}
