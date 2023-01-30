// 1. List 원소 3개 뽑아서 더하기
//  - for문을 3번 반복해서 해결?
//  - for문을 반복할 때 중복이 생길 수 있다.

// 2. 소수 판별하기
//  - x를 2로 나누고 2~(x/2) 까지의 정수로 나눠서 전부 나머지가 0이 아니면 소수

class Solution {
   public int solution(int[] nums) {
      int answer = 0;
      boolean chk = false;

      for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
               int num = nums[i] + nums[j] + nums[k]; //값을 담아
               if (num >= 2) //경우의 수를 찾아서
                  chk = sosu(num);
               if (chk == true) //소수가 맞을 경우
                  answer++; 

            }
         }

      }
      return answer;
   }
   
   public boolean sosu(int num) {
      boolean check = true; 
      if(num==2) { //소수일때
         return check;
         
      }
      for(int i=2; i<num; i++) { //소수가 아닐때
         if(num%i ==0) {
            check = false;
            break;
         }
      }
      return check;
   }
}
