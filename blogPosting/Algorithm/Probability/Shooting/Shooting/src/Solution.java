public class Solution {

    public int solution(double hitProbability){
        int answer = 0; // 총알 발사 횟수 초기화
        double targetProbability = 0.9;
        double currentProbability = 0.0; // 현재까지의 적중 확률 초기화

        while (currentProbability < targetProbability) {
            answer++; // 총알 발사 횟수 증가
            currentProbability = 1 - Math.pow(1 - hitProbability, answer); // 현재까지의 적중 확률 업데이트
        }

        return answer;
    }

}
