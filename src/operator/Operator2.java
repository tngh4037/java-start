package operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열과 문자열 더하기1 ( 자바는 특별하게 문자열에도 + 연산자를 사용할 수 있다. 문자열에 + 연산자를 사용하면 두 문자를 연결할 수 있다. )
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기1 ( 자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다. ) -> "a + b = " + "10" -> "a + b = 10"
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        // (정리) 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다. 쉽게 이야기 해서 문자열에 더하는 것은 다 문자열이 된다.
    }
}
