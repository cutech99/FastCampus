package fc.java.part2;

import java.util.*;

public class IfbasicTest {
    public static void main(String[] args) {
        // x의 값이 0보다 큰 경우에만 "양수입니다" 출력
        int x=10;
        if (x>0){
            System.out.println("양수입니다.");
        }
        // 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하세요.
        Scanner scan=new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int y=scan.nextInt();
        if (y%7==0){
            System.out.println(y + "는 7의 배수입니다.");
        }
        // 나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하세요.
        System.out.println("나이를 입력하세요:");
        int age=scan.nextInt();
        if (age>=19){
            System.out.println("성인입니다.");
        }

        System.out.println("종료");
    }
}