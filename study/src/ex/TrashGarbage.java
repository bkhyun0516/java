package ex;

public class TrashGarbage {
	public int check(int number, int k, int n, int[] line) {
		int sum =0;
		for(int i=0; i<k; i++) {
			int j = line[i]/number;
			sum += j;
		}
		if(sum == n) {
			return number;
		}
		else {
			return check(number-1,k,n,line);
		}
	}
	
	public int solution(int k, int n,int[] line) {
		int answer =0;
		int sum=0;
		int min = line[0];
		for(int i=0; i<k; i++) {
			sum += line[i];
			min = min(min,line[i]);
		}
		int startNumber = min(sum/n,min);
		return check(startNumber,k,n,line); 
	}
	public int min(int num1, int num2) {
		if(num1<=num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
}
