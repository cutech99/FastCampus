public class ForLoopTest {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);// 1~10
        }

        // 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하세요.
        for(char c='A';c<='Z';c++){
            System.out.println(c+":"+(int)c);
        }
        for(char c='a';c<='z';c++){
            System.out.println(c+":"+(int)c);
        }
        for(char i=65;i<=90;i++){
            System.out.println((char)i+":"+i); // A:65
        }
        // int[] numbers={1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력하세요.
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        // foreach문 (향상된 for문)
        for(int su : numbers){
            System.out.println(su);
        }
    }
}
