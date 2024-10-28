package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1 : object
        Student st2; // st2 : object
        Student st3; // st3 : object

        st1=new Student("손명준","신소재공학과",26,"bit@empas.com",20230110,"010-8383-5120"); // st1 : instance
        st2=new Student("김재영","코인발굴학과",26,"bit@empas.com",20230110,"010-8123-1414"); // st2 : instance
        st3=new Student("홍길동","컴퓨터공학과",26,"bit@empas.com",20230110,"010-8544-5170"); // st3 : instance

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
