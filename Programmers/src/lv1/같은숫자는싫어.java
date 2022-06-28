class Solution29{
    public int[] solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i< answer.length; i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        Solution29 sol = new Solution29();
        int[] answer = sol.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
