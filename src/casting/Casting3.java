package casting;

/**
 * 큰 범위에서 작은 범위의 대입은 다음과 같은 문제가 발생할 수 있다.
 * - 소수점 버림 (Casting2.class)
 * - 오버플로우 (Casting3.class)
 */
public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue); // -2147483648 => 오버플로우 발생

        // (참고)
        // 오버플로우가 발생했을 때 결과가 어떻게 되는지 계산하는데 시간을 낭비하지 말자. 중요한 것은 오버플로우가 발생하는 것 자체가 문제라는 점이다.
        // 오버플로우 자체가 발생하지 않도록 막아야 한다.
        // 이 경우 단순히 대입하는 변수(intValue)의 타입을 int -> long 으로 변경해서 사이즈를 늘리면 오버플로우 문제가 해결된다.
    }
}
