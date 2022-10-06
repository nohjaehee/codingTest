package test;

public class test2 {
	//문제 1 숫자비교하기
	//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
	class Solution {
	    public int solution(int num1, int num2) {
	        int answer = 0;
	        if( num1 == num2){
	            answer = 1;
	        }else if( num1 != num2){
	             answer = -1;
	        }
	   
	        return answer;
	    }
	}
	
	
	//문제2 나이출력하기
	//머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
	class Solution2 {
	    public int solution(int age) {
	        int answer = 2022 - age +1;
	        
	        return answer;
	    }
	}
	
	
	//문제 3 두수의 곱
	//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
	class Solution3 {
	    public int solution(int num1, int num2) {
	        int answer = num1 * num2;
	        return answer;
	    }
	}
	
	//문제 4 두수의 차
	//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
	class Solution4 {
	    public int solution(int num1, int num2) {
	        int answer = num1 - num2;
	        return answer;
	    }
	}
	
	
	//문제5 나머지 구하기
	//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
	class Solution5 {
	    public int solution(int num1, int num2) {
	        int answer = num1 %num2;
	        
	        return answer;
	    }
	}
}
