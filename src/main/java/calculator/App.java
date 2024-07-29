package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Calculator ca = new Calculator();

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("첫 번째 숫자를 입력하세요: " );
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("연산자를 입력하세요: ");
            char op = sc.next().charAt(0); // charAt(index): 입력 받은 string 타입을 char 타입 으로 변환

            double result = ca.calulate(num1, num2, op);

           System.out.println("가장 먼저 저장된 연산결과를 삭제하시겠습니까?(remove 입력시 삭제)");
            sc.nextLine();
            String deleteKeyWord = sc.nextLine();

            if (Objects.equals(deleteKeyWord, "remove")){
                ca.doubleList.remove(0);
                ca.doubleList.add(result);
            }else {
                ca.doubleList.add(result);
            }

            System.out.println("저장된 연산 결과를 조회하시겠습니까?(inquiry 입력시 조회)");
            String checkKeyWord = sc.nextLine();
            if (Objects.equals(checkKeyWord,"inquiry")){
                System.out.println(ca.doubleList);
            }

            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료) :");
            String str = sc.nextLine();
            if (Objects.equals(str, "exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
