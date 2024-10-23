package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO m=new MemberDTO();
        m.name = "손명준";
        //m.age = 26; // 에러발생(접근불가)
        m.phone = "010-8383-5102";
        System.out.println(m.name+"\t"+m.phone);
        m.play();
    }

}
