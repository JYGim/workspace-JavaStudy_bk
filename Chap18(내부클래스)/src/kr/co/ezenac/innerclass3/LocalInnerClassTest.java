package kr.co.ezenac.innerclass3;


class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(/*final*/ int i) {							//지역 변수 - 메서드 호출 후 끝날 때까지만 유효함
		/*final*/ int num = 100;										//지역 변수 - 메서드 호출 후 끝날 때까지만 유효함
		
		class MyRunnable implements Runnable {

			@Override
			public void run() {								// 내부 객체를 생성한 후 언제든 다시 호출 가능
//				num = 200;									//에러 발생	//이 때 local 변수는 유효하지 않은 상태임.
//				i = 10;										//에러 발생
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runable = outer.getRunnable(50);		//로컬변수는 호출 후 유효하지 않게 됨
		runable.run();									//언제든지 호출 가능한 상태임.
	}
}
