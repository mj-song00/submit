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
    }
}
