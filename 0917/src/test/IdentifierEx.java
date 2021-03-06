package test;//패키지 명 소문자

public class IdentifierEx {

	/*
		제이쿼리
		$.ajax
		언더스코어
		_a
	*/
	
	/*
	  식별자 규칙(안지키면 에러가 난다)
	  - 첫글자는 숫자가 안됨
	  - 특수 문자는 '_', '$' 만 사용가능
	   ( _로 시작하는 것은 자바 내부에서 사용하는 경우가 많아서 쓰는것을 지양해야한다.)
	  - 숫자,문자 가능
	  - 키워드(예약어)는 사용불가! 쓸 수가 읍서!(예약어는 전부 소문자...)
	 
	 개발자간의 규칙(에러는 안나지만 꼭 지켜야한다)
	 - 의미에 맞는 이름 짓기
	 - 왠만하면 영어로 짓기 
	 - 너무 축약하면 안된다.
	 - 각 식별자에 따라서 규칙을 반드시 지켜야한다!
	 	(클래스, 상수, 변수, 메서드, 생성자)
	 
	 클래스 
 		:첫글자 대문자/낙타표기법
 		ex) Test Computer GetRandomNumber  BatMan
	 변수
 		:첫글자 소문자/낙타표기법
 		ex) test computer getRandomNumber batMan 
	 상수
	 	:전부 대문자 / 언더바
	 	ex) TEST COMPUTER GET_RANDOM_NUMBER BAT_MAN
	 메서드
	 	:변수 규칙과 동일 + ()
	 	ex) test() computer() getRandomNumber() batMan()
	 생성자
	 	:클래스 규칙과 동일 + ()
	 	ex) Test() Computer() GetRandomNumber()  BatMan()
	 	
	*/
	int openDate;
	
}
