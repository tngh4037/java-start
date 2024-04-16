package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

    // (참고) add 메서드를 예로 들면,
    // add 메서드를 호출하는 순간, 그때 int a, int b 만큼의 메모리 공간이 할당되어 사용된다. 그리고 코드를 실행하면서 int sum에 대해서도 메모리 공간이 할당된다.
    // 그리고 리턴을 다 하고나면(메서드 호출이 끝나면) 기존에 썼던 a, b, sum 변수들은 더이상 안쓰기 때문에 다 폐기(제거)된다.
    // 이후 다시 add 메서드를 호출하면, 새로운 a,b,sum 이 만들어진다.
    // => 메서드를 호출할 때 마다 새로 생기고, 호출이 끝나면 사라지고를 반복한다.

    // (참고) 메서드 호출시 넘기는 값: 아규먼트, (인수 or 인자) - "들어가는 수", "메서드 내부로 들어가는 값"
    // (참고) 메서드 정의시 선언한 변수: 매개변수, 파라미터 - "중간에서 전달하는 변수", "메서드 호출부와 메서드 내부 사이에서 값을 전달하는 역할을 하는 변수"
    // => 메서드를 호출할 떄 인수를 넘기면, 그 인수가 매개변수에 대입된다.
}
