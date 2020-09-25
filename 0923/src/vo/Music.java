package vo;

public class Music {
	/*
	 * vo 규칙
	 * 1) 멤버 필드를 private로 선언 -> 은닉화
	 * 2) 멤버필드당 하나씩 setter,getter 선언
	 * 
	 * +기본생성자 
	 * 
	 */
	private String title;// 곡제목
	private int playTime;// 시간(초)
	//title Setter
	public void setTitle(String title) {
		this.title = title;
	}
	//title getter
	public String getTitle() {
		return this.title;
	}
	//playTime Setter
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	//playTime getter
	public int getPlayTime() {
		return this.playTime;
	}
}
