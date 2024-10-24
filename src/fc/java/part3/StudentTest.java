package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
//        정수 6개를 저장할 배열을 생성하세요.
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=30;
        arr[2]=67;
        arr[3]=98;
        arr[4]=55;
        arr[5]=32;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();

//        잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        Student std=new Student("손명준","신소재공학과",26,"bit@empas.com",20230110,"010-8383-5120");
        System.out.println(std);
    }
}
