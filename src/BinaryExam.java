public class BinaryExam {
    public static void main(String[] args) {
        // 123을 10진수, 2진수, 8진수, 16진수로 출력하시오.
        int decimal=123;
        System.out.println("decimal = " + decimal);
        int binary=0b01111011;
        System.out.println("binary = " + binary);
        int octal=0173;
        System.out.println("octal = " + octal);
        int hexa=0x7B; // 대소문자 상관없음
        System.out.println("hexa = " + hexa);

        // api 사용
        int data=123;
        String api_binary=java.lang.Integer.toBinaryString(data);
        System.out.println("api_binary = " + api_binary);
        String api_octal=java.lang.Integer.toOctalString(data);
        System.out.println("api_octal = " + api_octal);
        String api_hexa=java.lang.Integer.toHexString(data);
        System.out.println("api_hexa = " + api_hexa);
    }
}
