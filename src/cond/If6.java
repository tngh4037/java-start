package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        // (참고) if문 다음에 실행할 명령이 하나만 있을 경우에는 {} 중괄호를 생략할 수 있다. ( else if, else도 마찬가지이다. )
        /*
        if (false)
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행 안됨"); // -> 두번째 문장은 if문과 무관하다. (둘다 if문 안에 포함하려면 {}를 사용해서 그 안에 넣어줘야 한다.)
        */

        /*
        // 위 코드는 사실 아래와 같은 코드이다.
        if (false) {
           System.out.println("if문에서 실행됨");
        }
        System.out.println("if문에서 실행 안됨");
        */

        // 가급적이면 if문의 중괄호({})는 생략하지 않는게 좋다. (가독성, 유지보수성)
    }
}
