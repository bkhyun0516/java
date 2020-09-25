package vo;

/*
 * 
 * vo란
 * - value  object의 줄임말
 * - 데이터를 저장하는 객체
 * - DTO라고도 함(Data Transfer Object)
 * - VO 생성규칙
 * 1) 멤버 필드를 private으로 선언
 * 2) 멤버 필드의 접근을
 *	  setter, getter로 접근
 * 
 * 
 */
public class Movie {

	// 접근제한자가 private이고 객체자료형 String형인
	// 인스턴스 멤버필드 title
	
	private String title;//영화제목
	
	private String director;//감독명
	
	private int audienceNum;//관객수
	
	
	//title의 setter (무조건 인스턴스 메소드 진짜 ㄹㅇ)
	public void setTitle(String title) {
		this.title = title;
	}
	//title의 getter (무조건 인스턴스 메소드 진짜 ㄹㅇ)
	public String getTitle() {
		return this.title;
	}
	//director의 setter
	public void setDirector(String director) {
		this.director = director;
	}
	//director의 getter
	public String getDirector() {
		return this.director;
	}
	//audienceNum의 setter
	public void setAudienceNum(int audienceNum) {
		this.audienceNum = audienceNum;
	}
	//audienceNum의 getter
	public int getAudienceNum() {
		return this.audienceNum;
	}
	
	
	
	
	
	/*
	 * 
	 * 은닉화란 멤버를 private으로 선언하여
	 * 외부에서 직접 접근하지 못하게 막는
	 * 방법
	 * (은행의 금고를 생각하면 됩니다)
	 * 
	 * 
	 *  
	 *  why? : 외부에서 직접 접근할 경우
	 *  잘못된 값이 들어갈 수 있고
	 *  적절하지 않게 사용될 수 있어서
	 * 
	 *  
	 *  
	 * 캡슐화란
	 * 
	 * 외부에 알릴 필요가 없는 기능 및 
	 * 속성을 숨기는 것
	 *  
	 * 
	 */
}













