package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.date = "2022.12.14";
        m.mainchar = "제이크 설리";
        m.genre = "액션";
        m.runtime = 192;
        m.age = 12;

        System.out.println(m.title+"\t"+m.date+"\t"+m.mainchar+"\t"+m.genre+"\t"+m.runtime+"\t"+m.age);
    }
}
