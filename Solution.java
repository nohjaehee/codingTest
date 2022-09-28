package test1;

public class Solution {
	
	//1번 문제 
	//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    public String solution1(int num) {
        return num % 2 == 0 ? "Even": "Odd";
   }
	
    
    //2번문제
    //정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	
    public double solution2(int[] arr) {
        double answer = 0;
        for(int i=0;i<arr.length;i++){
            answer += arr[i];
        }
        answer /= arr.length;
    return answer;
    }
	
	
    //3번문제
    //정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
    public int solution3(int n) {
        
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0)answer +=i;
        }
        return answer;
    }
	
    //4번문제
    //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
   // 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
    
    public int solution4(int n) {
        int answer = 0;
         String [] arr = String.valueOf(n).split("");
//         System.out.println("arr : "+String.valueOf(n).split(""));
        for(String integer : arr){
        //	System.out.println(Integer.parseInt(integer));
            answer += Integer.parseInt(integer);
        }

        return answer;
    }
    
 
    
    //5번문제
//    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    
    public long solution5(long n) {
        long answer = 0;
        Double x = Math.sqrt(n); //제곱근을 구하고
        System.out.println(x);
        if(x == x.intValue()){ //정수일때
            answer = (long)Math.pow(x+1 , 2);//제곱해주기
        }else {
            answer = -1;
        }
        return answer;
    }
}