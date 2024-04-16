package casting;

/**
 * 큰 범위에서 작은 범위의 대입은 다음과 같은 문제가 발생할 수 있다.
 * - 소수점 버림 (Casting2.class)
 * - 오버플로우 (Casting3.class)
 */
public class Casting2 {

    // 큰 범위 -> 작은 범위로의 대입은 (값이 손실되는 문제가 발생할 수 있기에) 캄파일 오류가 발생한다.
    // 그러나 개발자가 이런 위험을 감수하더라도 값을 대입하고 싶은 경우, (int)와 같이 괄호를 사용해서 직접 명시적으로 형변환을 해줘야 한다. (명시적 형변환)
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생 ( java: incompatible types: possible lossy conversion from double to int )
        intValue = (int) doubleValue; // 형변환 (명시적 형변환)

        System.out.println("intValue = " + intValue); // 출력:1
        System.out.println("doubleValue = " + doubleValue);
    }
}
