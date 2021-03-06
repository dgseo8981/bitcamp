package step25.ex9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("step25/ex9/application-context.xml");
        
        boardService boardService = iocContainer.getBean(boardService.class);

        Board b1 = new Board();
        b1.setNo(161);
        b1.setTitle("1111");
        b1.setContent("xxxx");

        Board b2 = new Board();
        b2.setNo(162);
        b2.setTitle("2222");
        b1.setContent("xxxx");
        
        Board b3 = new Board();
        b3.setNo(161);
        b3.setTitle("3333");
        b1.setContent("xxxx");
        
        boardService.test2(b1, b2, b3);
        System.out.println("입력 성공!");
    }
}
