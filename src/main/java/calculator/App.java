package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       // level1 -1
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char op = sc.next().charAt(0); // charAt(index): 입력 받은 string 타입을 char 타입 으로 변환

        System.out.println("첫 번째 숫자를 입력하세요: " + num1 );
        System.out.println("두 번째 숫자를 입력하세요: " + num2 );

        switch (op){

            case '+':
                int sum = num1 + num2;
                System.out.println("결과 : " + sum);
                break;
            case '-':
                int subtract = num1 - num2;
                System.out.println("결과 : " +subtract);
                break;
            case '*':
                int multiply = num1 * num2;
                System.out.println("결과 : " + multiply);
                break;
            case '/' :
//                if (num2 != 0) {
//                    int divide = num1 / num2;
//                    System.out.println("결과 : " + divide);
//                }else{
//                    System.out.println("num2는 0이 될 수 없습니다.");
//                }
                // 32~ 37 번재 if문 삼항연산자로 변환
                System.out.println((num2 != 0) ?"결과 : " + num1 / num2 : "num2는 0이 될 수 없습니다.");
                break;
            default:
                System.out.println("잘못된 입력값 입니다.");
                break;
        }



    }
}
