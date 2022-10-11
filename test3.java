package test;

public class test3 {
	//문제 1 몫구하기
	//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
	class Solution {
	    public int solution(int num1, int num2) {
	        int answer = 0;
	       answer = num1 / num2;
	        return answer;
	    }
	}
	
	
	//문제2 두수의 합
	//정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
	class Solution2 {
	    public int solution(int num1, int num2) {
	        int answer = -1;
	        answer = num1 + num2;
	        return answer;
	    }
	}
	
	
	//문제 3 각도기
	//정수 n각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
	class Solution3 {
	    public int solution(int angle) {
	                
	        int answer = 0;
	        if(0 < angle && angle < 90){
	            answer = 1;
	        }else if(angle == 90){
	            answer = 2;
	        }else if(90 < angle && angle< 180){
	            answer = 3;
	        }else if(angle == 180){
	             answer = 4;
	        }
	        return answer;
	    }
	}
	//문제 4 문자열안에 문자열
	//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
	class Solution4 {
		public int solution(String str1, String str2) {
		        int answer = 1;

		        if(!str1.contains(str2)) {
		        answer=2; 
		        }
		        return answer;
		    }
		}
	
	
	//문제5 나머지 구하기
	//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
	class Solution5 {
	    public int solution(int num1, int num2) {
	        int answer = 0;
	        answer =  1000 * num1 / num2;       
	        return answer;
	    }
	}
}
