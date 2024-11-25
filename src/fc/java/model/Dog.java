package fc.java.model;

public class Dog extends Animal {
    public Dog() {
        super(); // new Animal()
    }
//    재정의
    public void eat() {
        System.out.println("개 처럼 먹다");
    }

}
