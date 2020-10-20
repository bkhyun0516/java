package ex;

public class Ex42 {
	int max = 0;
	public int Search(int n, int left,int right,int[] lines) {
		if(left>=right)
			return max;
		int mid = (left+right)/2;
		int numberOfLine = check(mid,lines);
		System.out.println("왼쪽"+left +" 오른쪽 "+ right);
		System.out.println("현재 길이"+ mid +"줄 수 "+numberOfLine);
		System.out.println();
		if(numberOfLine < n) {//기준보다 적게 만들어 졌을 때 길이 줄임
			return Search(n,left,mid-1,lines);
		}
		else if(numberOfLine == n) {//기준치일때 길이 늘려본다.
			
			max = max(mid,max);
			return Search(n,mid+1,right,lines);
		}
		else{//기준보다 많이 만들어 졌을 때 길이 늘림
			return Search(n,mid+1,right,lines);
		}
	}
	public int solution(int k, int n,int[] lines) {
		int max = lines[0];
		for(int i=0; i<k; i++) {
			max = max(max,lines[i]);
		}
		return Search(n,0,max,lines);
	}
	public int check(int num, int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=(arr[i]/num);
		}
		return sum;
	}
	public int max(int num1, int num2) {
		if(num1<=num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	public static void main(String[] args) {
		Ex42 e = new Ex42();
		int k = 4;
		int n = 11;
		int[] line = {802, 743,457,539};
		System.out.println(e.solution(k,n,line));
	}

}
