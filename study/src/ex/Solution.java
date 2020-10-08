package ex;
class Solution {
	 public double[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        double[] failRate = new double[N];
	        for(int i=1;i<=N ;i++){
	            answer[i-1] = i;
	        }//1~N 배열 생성
	        int[][] proc = new int[N][2];
	        int size=stages.length;
	        
	        
	        for(int i =0; i<size; i++){
	            if(stages[i]==N+1){
	                proc[N-1][1]++;
	                stages[i]=N;
	            }
	            for(int j=0; j<stages[i];j++){
	                proc[j][0]++;
	                proc[j][1]++;
	            }
	            proc[stages[i]-1][1]--;
	        }
	        for(int i=0; i<N;i++){
	           System.out.println();
	           System.out.println(proc[i][0]);
	           System.out.println(proc[i][1]);
	           System.out.println();
	        }
	        
	        for(int i=0; i<N;i++){
	            if(proc[i][0]==0){
	                failRate[i]=0;
	            }
	            else{
	                failRate[i]=(double)proc[i][1]/proc[i][0];
	            }
	        }
	        for(int i=0; i<N;i++){
	           for(int j=i ; j<N;j++){
	               if(failRate[answer[i]-1]<=failRate[answer[j]-1] && answer[i]<answer[j]){
	                   int tmp = answer[i];
	                   answer[i] = answer[j];
	                   answer[j] = tmp;
	               }  
	           }
	        }
	        
	        return failRate;
	 }
	 public static void main(String[] args) {
		Solution sol = new Solution();
		int[] stages= {4, 4, 4, 4, 4};
		double[] d = sol.solution(4,stages);
		for(int i=0; i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
	
}