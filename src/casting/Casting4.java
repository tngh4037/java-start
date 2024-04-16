package casting;

/**
 * [대원칙] 자바에서 계산은 다음 2가지를 기억하자.
 * 1) 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
 *  ㄴ int + int는 int를, double + double은 double의 결과가 나온다.
 *
 * 2) 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
 *  ㄴ int + long은 long + long으로 자동 형변환이 일어난다.
 *  ㄴ int + double은 double + double로 자동 형변환이 일어난다.
 */
public class Casting4 {

    public static void main(String[] args) {

        // (참고) 자바에서 기본적인 숫자 리터럴은 int이다.
        // (참고) 자바에서 기본적인 실수 리터럴은 double이다.

        int div1 = 3 / 2; // int / int = int ( 같은 타입끼리의 계산은 같은 타입의 결과를 낸다. )
        System.out.println("div1 = " + div1); // 1
        double div2 = 3 / 2; // int / int = (double) int ( 같은 int 타입끼리의 계산이므로 int(1)가 나온다. 그런데 받고자 하는 타입이 더 큰 범위인 double 이니 자동 형변환이 일어난다. )
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2; // double / int ( double / int 이므로, 서로 다른 타입끼리의 계산은 큰 범위로 자동 형변환이 일어난다. 즉 double / double 로 형변환이 발생한다. 결과적으로 double / double = double 이 된다. )
        System.out.println("div3 = " + div3); // 1.5


        // 명시적 형변환
        double div4 = (double) 3 / 2; // double / int ( double / int 이므로, 서로 다른 타입끼리의 계산은 큰 범위로 자동 형변환이 일어난다. 즉 double / double 로 형변환이 발생한다. 결과적으로 double / double = double 이 된다. )
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
