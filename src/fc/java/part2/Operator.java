package fc.java.part2;

// JavaSE 프로그램
public class Operator {
    public static void main(String[] args) {
        //두 과목의 점수(정수)를 이용하여 총점과 평균을 출력하는 JavaSE프로그램을 만들어보자
        int kor, eng; // 변수 선언->기억공간이 만들어진다.
        kor = 77;
        eng = 87;
        int tot=kor+eng; // 총점
        int mean=(tot)/2; // 평균
        System.out.println("총점:"+tot);
        System.out.println("평균:"+mean);
    }
}
