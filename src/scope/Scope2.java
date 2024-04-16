package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부, for문 내
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료

        // System.out.println("main i = " + i); // 오류, i에 접근 불가
        System.out.println("main m = " + m);
    }

    // for (int i = 0;..)과 같인 for문 안에서 초기식에 직접 변수를 선언할 수 있다.
    // 이렇게 선언된 변수는 for문 코드 블록 안에서만 사용할 수 있다.
}
