package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        // switch 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다. (참고. break;를 만나면 해당 switch 문을 빠져나온다.)
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
