package objectClass;
//은행계좌 클래스
public class Account {
	//멤버변수(필드, 속성) - 
	static final String BANKNAME="신한은행"; //static이 붙은 것:클래스변수, 안붙은것:인스턴스변수
	String accountNo; //계좌번호 저장하는 변수
	String ownerName; //예금주 이름을 저장할 변수
	int balance;  //통장잔액(우리나라 돈 소수점으로 떨어지지 않으니까 타입 int로 지정)
	
	//생성자 -객체의 초기화 담당, 생성자 만들 때 빈생성자 만들어야한다.(익명으로 만들 때 필요함.예제1번처럼)
	public Account() {
		
	}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//메서드 - 그 클래스의 기능을 적는 곳(예시.객체 리모컨에 있는 기능단추들-하는 일)
	//예금한다 메서드
	void deposit(int amount) {  /*void라고 쓰면 return값이 없음.(일만 처리해줌) 
		                         deposit은 메소드 이름(개발자가 명명) (int amount)는 매개변수(외부로부터 값을 받을 수 있는 변수) */
		balance+=amount;  //balance=balance+amount; 
	}
	//인출한다 메서드 -하는일을 정의
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다."); //Exception 예외처리를 만듦(예금했던 금액보다 돈을 더 출금하려고 할 때)
		}
		balance-=amount;   //balance=balance-amount;
		return amount;
	}
}
//매개변수:메서드가 작업을 수행하는데 필요한 값들(입력)을 제공받기 위한 것