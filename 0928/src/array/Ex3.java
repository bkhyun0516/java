package array;

public class Ex3 {

	public static void main(String[] args) {
		String[] names
		= {"RM", "뷔","슈가","진","제이홉","정국","지민"};

		String[] nameBTS = new String[7];
		nameBTS[0] ="RM";
		nameBTS[1] ="뷔";
		nameBTS[2] ="슈가";
		nameBTS[3] ="진";
		nameBTS[4] ="제이홉";
		nameBTS[5] ="정국";
		nameBTS[6] ="지민";
		int s = nameBTS.length;
		for(int i =0; i < s; i++) {
			System.out.println(nameBTS[i]);
		}//for end
		System.out.println();
		for (String name : names) {
			System.out.println(names);
		}//for end
	}

}
