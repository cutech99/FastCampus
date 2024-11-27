package fc.java.part4;

import fc.java.poly.*;

public class AbstractClass {
    public static void main(String[] args) {
//        추상클래스는 단독으로 객체를 생성할 수 없다.
//        Animal ani=new Animal(); --> 객체를 생성 할수 없다.
//        추상클래스는 부모의 역할은 할 수 있다.
        Animal ani=new Dog();
        ani.eat();
        ani.move();

        ani=new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
