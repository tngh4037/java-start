package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력: a + b = 7

        // 뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력: a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력: a - b = 10

        // 나눗셈
        int div = a / b; // 자바에서 같은 int형끼리 계산하면 계산 결과도 같은 int형을 사용한다. (int형은 정수이기 때문에 소수점 이하를 포함할 수 없다.) => 해결 방안은 이후 형변환에서 다룬다.
        System.out.println("a / b = " + div); // 출력: a / b = 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력: a % b = 1

        // (주의) 0으로 나누기
        // 10 / 0 과 같이 숫자는 0으로 나눌 수 없다. (수학에서 허용하지 않음)
        // 실행하면 다음과 같은 예외를 확인할 수 있다. : Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
