public class CastingTest {
    public static void main(String[] args) {
        float f1=.10f; // 0.10
        System.out.println("f1 = " + f1);
        float f2=15f; // 15.0
        System.out.println("f2 = " + f2);
        float f3=3.14f; // 3.14
        System.out.println("f3 = " + f3);
        double d1=123.4567;
        System.out.println("d1 = " + d1);

        float x=15.6f;
        int y=(int)x; // 실수형을 정수형에 넣을수 없기때문에 강제형변환을 해야함 -> 손실이 생김
        System.out.println("y = " + y); // 15

        char c='A';
        int cc=c; // 수치형 자료기 때문에 자동형변환
        System.out.println("cc = " + cc); // 65

        int dd=5;
        double ddd=dd; // 4byte -> 8byte 자동형변환
        System.out.println("ddd = " + ddd); // 5.0

        double dx=14.67;
        int dy=(int)dx; // 8byte -> 4byte 강제형변환
        System.out.println("dy = " + dy);



    }
}
