package koreait.day14;

@FunctionalInterface
public interface FunctionA {
	int methodA(int a, int b);

}

//	함수형 인터페이스 : @FunctionalInterface 애노테이션 사용합니다 (코딩에 도움을 주는 주석이라고 봐도 된다)
//	인터페이스 중에 "추상메소드가 1개인 것"은 다른 프로그래밍 언어에서 사용되는 함수의 형식으로 표현할 수 있습니다.
//	다른 프로그래밍 언어와 자바에서 '->' 기호로 줄여서 씁니다. (람다식)	가독성, 간결성을 위해서 사용합니다.