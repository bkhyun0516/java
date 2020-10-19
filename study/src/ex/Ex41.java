package ex;

public class Ex41 {
	public int[] sort (int n,int[] arr) {
		for(int i=0; i<n;i++) {
			for(int j=i; j<n;j++) {
				if(arr[j]<arr[i]) {
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j]=tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	public int search(int target, int left, int right, int[] iArr){
		if(right<=left) {
			return -2;
		}
		int mid = (left+right)/2;
		if(target == iArr[mid]) {
			return mid;
		}else if(target < iArr[mid]) {
			return search(target, left, mid, iArr);
		}else {
			return search(target, mid+1, right, iArr);
		}
	}
	public int solution(int n, int m, int[] arr) {
		int answer =0;
		arr = sort(n,arr);
		return search(m, 0, n, arr)+1;
	}
	public static void main(String[] args) {
		int n = 8;
		int m = 12;
		int[] iArr = {23, 87, 65, 12, 57, 32, 99, 81};
		Ex41 e = new Ex41();
		System.out.println(e.solution(n,m, iArr));
	}

}
