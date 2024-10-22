package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // 한 [사람]의 데이터를 저장할 [변수를 선언]하세요.
        // 모델링 된 Person클래스를 이용하여 [객체를 메모리에 생성]하세요.
        // [인스턴스를 만드는 과정]
        Person p = new Person();
        p.age = 26;
        p.name = "손명준";
        p.phone = "010-8383-1234";
        System.out.println("나이 :"+p.age+"\t"+"이름 :"+p.name+"\t"+"전화번호 :"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.age = 26;
        p1.name = "허재원";
        p1.phone = "010-1234-5678";
        System.out.println("나이 :"+p1.age+"\t"+"이름 :"+p1.name+"\t"+"전화번호 :"+p1.phone);
        p1.play();
        p1.eat();
        p1.walk();

    }
}
