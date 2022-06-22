class Solution19{
    public int solution(int n){
        int answer = 0;
        if(n==1) return 0;
        if(n==2) return 1;

        for(int i=2; i<=n; i++){ // n까지 순회
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) answer++;
        }
        return answer;
    }
}
