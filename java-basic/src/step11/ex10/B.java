package step11.ex10;

public class B extends A {
    // 부모 클래스인 A에 이미 plus() 라는 이름을 가진 메서드가 여러 개 있다.
    // 그럼에도 불구하고 파라미 형식이 다른 메서드를 추가한다면
    // 역시 마잔가지로 오버로딩이다.
    // 즉 한 클래스 안에서 같은 이름의 메서드를 여러 개 만드는 것만 오
    static void m(int a, int b, int c) {
        System.out.println("m(int,int,int)");
    }
}
