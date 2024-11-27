package fc.java.poly;

public class Cat extends Animal { // Animal -> eat(); 부모가 갖고있는 추상메서드
//    재정의를 하지 않음(x) ---> 오류입니다(재정의를 하세요)
//    재정의를 반드시 해야한다. -> 구현해야한다. 구현부(바디) ({  })를 만들어야한다.
    public void eat() {
        System.out.println("고양이 처럼 먹다.");
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이 난다");
    }
}
