package array;

public class Ex4 {

	public static void main(String[] args) {
		int[] iArr = {3,5,7,9,11,13};
		int size = iArr.length;
		for(int i=0; i <size; i++) {
			System.out.println(iArr[i]);
		}//for end
		for (int i : iArr) {
			System.out.println(i);
		}
	}

}
