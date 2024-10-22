package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p=new Person();
        p.name="손명준";
        p.age=1026; // ?
        p.phone="010-1234-5678";

        System.out.println("이름 :"+p.name+"\t"+"나이 :"+p.age+"\t"+"전화번호 :"+p.phone);
    }
}
