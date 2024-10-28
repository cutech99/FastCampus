package fc.java.part3;

import fc.java.model.MyUtil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // MyUtil
        MyUtil1 m1=new MyUtil1();
        int sum=m1.hap(a,b);
        System.out.println("sum = " + sum);
    }
}