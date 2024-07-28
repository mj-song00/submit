package calculator;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       // level1 -1
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

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
            if (count >= arr.length) {
                // 배열이 가득 찼을 경우 모든 요소를 앞으로 이동
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = result; // 가장 마지막에 새 결과 저장
            } else {
                arr[count] = result;
                count++;
            }

            System.out.println("count :" +count);
            System.out.println(Arrays.toString(arr));
            sc.nextLine();

            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료) :");
            String str = sc.nextLine();
            if (Objects.equals(str, "exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
