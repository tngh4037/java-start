package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        } // x 생존 종료

        // System.out.println("main x = " + x); // 오류, 변수 x에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료

    // 지역 변수는 본인의 코드 블록 안에서만 생존한다. ( 코드 블록을 벗어나면 제거된다. )
    // 변수의 접근 가능 범위 = 스코프(Scope)
}
