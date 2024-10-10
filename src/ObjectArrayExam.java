public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3편을 저장 할 [배열을 생성]하고 영화 3편의 데이터를 저장하고 출력하세요.
        Movie[] m=new Movie[3];
        m[0]=new Movie();
        m[0].title="A영화";
        m[0].mainchar="박매일";
        m[0].runtime=160;
        m[0].age=15;
        m[0].date="2023-01-15";

        m[1]=new Movie();
        m[1].title="B영화";
        m[1].mainchar="나길동";
        m[1].runtime=180;
        m[1].age=12;
        m[1].date="2023-01-11";

        m[2]=new Movie();
        m[2].title="C영화";
        m[2].mainchar="조길동";
        m[2].runtime=140;
        m[2].age=18;
        m[2].date="2022-11-16";
        //반복문
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].title+"\t"+m[i].mainchar+"\t"+m[i].runtime+"\t"+m[i].age+"\t"+m[i].date);
        }

    }
}
