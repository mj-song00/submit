package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> inQueue = new LinkedList<>();


        while(true){
            int result = 0;
            System.out.println("첫 번째 숫자를 입력하세요: " );
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("연산자를 입력하세요: ");
            char op = sc.next().charAt(0); // charAt(index): 입력 받은 string 타입을 char 타입 으로 변환

            switch (op){
                case '+':
                    result = num1 + num2;
                    System.out.println("결과 : " +  result);
                    break;
                case '-':
                    result= num1 - num2;
                    System.out.println("결과 : " +  result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과 : " +  result);
                    break;
                case '/' :
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("결과 : " + result);
                }else{
                    System.out.println("num2는 0이 될 수 없습니다.");
                }
                break;
                default:
                    System.out.println("잘못된 입력값 입니다.");
                    break;
            }

            System.out.println("가장 먼저 저장된 연산결과를 삭제하시겠습니까?(remove 입력시 삭제)");
            sc.nextLine();
            String deleteKeyWord = sc.nextLine();

            if (Objects.equals(deleteKeyWord, "remove")){
                inQueue.poll();
                inQueue.add(result);
            }else {
                inQueue.add(result);
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
