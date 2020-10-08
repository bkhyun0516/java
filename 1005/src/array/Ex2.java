package array;

public class Ex2 {

	public static void main(String[] args) {
		String[] names = {"손흥민","케인","베일","알리","은돔벨레"};
		for(String name : names) {
			name="후후";//연결된 레퍼런스가 바뀐 것 
						//지역변수여서 영향을 미칠수 없다.
		}//for end
		
		//일반 for문
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}//for end
		
		//for each문 
		for(String name : names) {
			System.out.println(name);
		}//for end
		
	}// main() end

}//Ex2 end
