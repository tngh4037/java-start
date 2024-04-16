package variable;

public class Var8 {

    public static void main(String[] args) {
        // (참고) 표현할 수 있는 범위가 클수록 더 많은 메모리 공간을 차지한다.

        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (long은 뒤에 L을 넣어주어야 한다. 소문자를 넣어도되지만 관례상 소문자 l은 숫자 1과 착각할 수 있어서 권장하지 않는다.)

        // 실수
        float f = 10.0f; // 실수 리터럴은 기본이 double형 이므로, float형을 사용하려면 f를 붙여서 float 형으로 지정해야 한다. (double이 범위가 더 크다.)
        double d = 10.0;

        // [참고] 리터럴 타입 지정
        // 1) 정수 리터럴은 int 를 기본으로 사용한다.
        // long k1 = 2147483647; // (O)
        // long k2 = 2147483648; // (X), Integer number too large
        // long k3 = 2147483648L; // (O)
        // 2) 실수 리터럴은 기본이 double 형을 사용한다. ( float은 표현 범위가 작아 소수점 계산 등에서 오류가 많이 발생하므로 권장하지 않는다. 실무에서 float을 사용하는 경우는 거의 없다. (표현 범위가 작아 계산이 잘 안된다. -> 정밀도가 낮다.) )
        // float k4 = 10.0; // (X)
        // float k5 = 10.0f; // (O)

        // [참고] 실무에서 자주 사용하는 타입
        // 1) 정수: int, long (파일을 다룰 때는 byte를 사용한다.)
        // 2) 실수: double (실수는 고민하지 말고 double을 쓰면 된다.)
        // 3) 불린형: boolean
        // 4) 문자열: String (문자 하나든 문자열이든 String을 사용하는 것이 편리하다.)
    }
}