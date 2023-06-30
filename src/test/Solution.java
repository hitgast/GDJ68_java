package test;

class Solution {
//    public int solution(int[] number) {
//        int answer = 0;
//        
//        for(int i=0; i<number.length; i++){
//            for(int j=i+1; j<number.length; j++){
//            	for(int k=j+1; k<number.length; k++) {
//            		if(number[i] + number[j] + number[k] == 0) {
//                    	answer++;
//                    }
//            	}
//            }
//        }
//        
//        return answer;
//    }
//    
//    public static void main(String[] args){
//        int[] values = {3, -2, -1, 1, -3, 0};		
//        Solution sol = new Solution();
//        
//        System.out.println(sol.solution(values));
//        
//    }
	
	
	
//	public int solution(String t, String p) {
//	    int answer = 0;
//	    int ct = Integer.parseInt(t);
//	    int cp = Integer.parseInt(p);
//	    
//	    for(int i=0; i<t.length(); i++) {
//	    	t.substring(i, i+1);
//	    }
//	    
//	    if(ct > cp) {
//	    	
//	    }
//	    
//	    return answer;
//    }
//	
//	public static void main(String[] args){
//		String t = "274523";
//		String p = "32";
//		Solution sol = new Solution();
//      
//		System.out.println(sol.solution(t, p));
//      
//	}
	
	public static void main(String[] args){
		double num1 = 7;
		double num2 = 3;
		
		if(0<=num1 && num1<=100 && 0<=num2 && num2<=100){
			double answer = (num1 / num2) * 1000;
			System.out.println((int)answer);
	    }
		
	}
	
}