class Solution20{
    public String solution(String[] seoul){
        String answer = "";
        int index = 0;
        for(int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }

        }
        return "김서방은 " + index + "에 있다"; // initialize를 해야 오류가 안 남
    }
}
public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        Solution20 sol = new Solution20();

        System.out.println(sol.solution(seoul));
    }
}
