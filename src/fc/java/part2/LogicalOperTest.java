package fc.java.part2;

public class LogicalOperTest {
    public static void main(String[] args) {
        int x=1,y=0;
        System.out.println(!(x>0)); // false
        System.out.println(x>0&&x<3); // T&&T -> true
        System.out.println(x>0&&y<0); // T&&F -> false
        System.out.println(x<0||y>=0); // F||T -> true
        System.out.println(y<0&&y<-5); // F&&F -> false

        int a=3, b=5;
        System.out.println((a>=3)&&(b<6)); // T&&T -> true
        System.out.println((a!=3)&&(a>2)); // F&&T -> false
        System.out.println((b!=5)||(a==1)); // F||F -> false
    }
}
