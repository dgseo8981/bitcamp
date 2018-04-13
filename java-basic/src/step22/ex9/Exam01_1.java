package step22.ex9;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test8.data");
        DataOutputStream out = new DataOutputStream(fileOut);
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            out.writeUTF(member.name);
            out.writeInt(member.age);
            out.writeBoolean(member.gender);
        }
        long endTime = System.currentTimeMillis();
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        System.out.println(endTime - startTime);
    }
}
