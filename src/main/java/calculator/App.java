package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {

//        Calculator ca = new Calculator();
        ArithmeticCalculator ca = new ArithmeticCalculator();
        CircleCalculator ci = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. 계산하기 | 아무거나 누르면 원의 넓이 구할 수 있어요");

            if (Objects.equals(sc.nextInt(), 1)) {
                System.out.println("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.println("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.println("연산자를 입력하세요: ");
                char op = sc.next().charAt(0); // charAt(index): 입력 받은 string 타입을 char 타입 으로 변환

                double result = ca.calulate(num1, num2, op);

                System.out.println("가장 먼저 저장된 연산결과를 삭제하시겠습니까?(remove 입력시 삭제)");
                sc.nextLine();
                String deleteKeyWord = sc.nextLine();

                if (Objects.equals(deleteKeyWord, "remove")) {
                    ca.setRemoveResult();
                    ca.setAddResult();
                } else {
                    ca.setAddResult();
                }

                System.out.println("저장된 연산 결과를 조회하시겠습니까?(inquiry 입력시 조회)");
                String checkKeyWord = sc.nextLine();
                if (Objects.equals(checkKeyWord, "inquiry")) {
                    System.out.println(ca.getResult());
                }

                System.out.println("더 계산 하시겠습니까? (exit 입력시 종료) :");
                String str = sc.nextLine();
                if (Objects.equals(str, "exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } else  {
                //원의 넓이 구하기
                System.out.println("반지름을 입력해주세요: ");
                int r = sc.nextInt();

                double result = ci.calculateCircleArea(r);
                ci.setAddResult();
                System.out.println("원의 넓이는 " + result + "입니다.");

                System.out.println("저장된 결과를 조회하시겠습니까?(inquiry 입력시 조회)");
                sc.nextLine();
                String checkKeyWord = sc.nextLine();
                if (Objects.equals(checkKeyWord, "inquiry")) {
                    System.out.println(ci.getResult());
                }

                System.out.println("더 계산 하시겠습니까? (exit 입력시 종료) :");
                String str = sc.nextLine();
                if (Objects.equals(str, "exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
        }
    }
}
