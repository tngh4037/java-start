package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }

    private static double average(int a, int b, int c) {
        return ((a + b + c) / 3.0);
    }
}
