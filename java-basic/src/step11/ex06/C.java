package step11.ex06;

public class C extends B {
    int v3;
    
    C(){
        //슈퍼 클래스의 어떤 생성자를 호출할지 지정하지 않으면 컴파일러는 
        //다음과 같이 슈퍼 클래스의 기본 생성자를 호출하라는 명령을 붙인다.
        //super(); //즉 개발자가 붙이지 않으면 자동으로 붙인다.
        System.out.println("C() 생성자");
        
        
    }
}
