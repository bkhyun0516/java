package example;

public class ExampleEx2 {
	public static void main(String[] args) {
		for(int i=1; i<10;i++) {
			char word= '\t';
			for(int j=1 ;j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j);
				if(j==9) {
					word='\n';
				}//if end
				System.out.print(word);
			}// for end
		}// for end
	}//main end
}
