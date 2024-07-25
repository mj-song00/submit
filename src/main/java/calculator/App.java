package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       // level1 -1
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("첫 번째 숫자를 입력하세요: " + num1 );
        System.out.println("두 번째 숫자를 입력하세요: " + num2 );

        char op = sc.next().charAt(0); // charAt(index): 입력 받은 string 타입을 char 타입 으로 변환
        System.out.println("사친 연산 기호를 입력하세요: " + op );

    }
}
