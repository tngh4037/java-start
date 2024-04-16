public class HelloJava {
    public static void main(String[] args) { // 프로그램을 시작하는 실행 시점이라고 생각하자. ( 프로그램(HelloJava)을 실행하면, 자바는 public static void main(String[] args) 이라고 되어 있는 것을 찾아서 여기서 프로그램을 시작한다. )
        System.out.println("hello java"); // 값을 콘솔에 출력하는 기능이다.
    } // main() 메서드의 범위 끝: main 메서드의 {} 블록이 끝나면 프로그램은 종료된다.
}

// (참고)
// public static void main(String[] args) {..} => 처음 프로그램을 시작하는 메서드
// 자바의 규칙: 처음 프로그램을 시작할 때, public static void main(String[] args) {..} 로 된것을 시작할게.