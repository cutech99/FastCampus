package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한사람의 [회원] 정보를 저장할 [객체를 생성] 하세요.
        PersonVO vo=new PersonVO();
        vo.setName("손명준");
        vo.setAge(26);
        vo.setPhone("010-8383-5102");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
    }
}