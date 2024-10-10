public class FindAPI {
    public static void main(String[] args) {
        int a; // 변수 선언
        a=10;
        System.out.println("a = " + a);
        // "APPLE" 문자열 저장하고 출력
        java.lang.String s; // java, lang 은 package(=폴더) 라고 부른다. -> lang 패키지는 자주 사용하는 클래스들이기 때문에 생략가능 하다.
                            // 만약 자주 안쓰는 클래스를 사용하려면 해당 클래스의 위치까지 포함하여 적어야함.
        s="APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length()); // String 클래스 안에 들어있는 method를 사용하기위해서 s. 을 사용함

    }
}
