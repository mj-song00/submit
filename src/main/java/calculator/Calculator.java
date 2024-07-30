package calculator;

import java.util.ArrayList;

public class Calculator {
  final  ArrayList<Double> doubleList = new ArrayList<>();
    Double lastResult;

    //간단한 계산기
   public double  calulate(int num1, int num2, char operator){
        double result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    result = num1 / num2;
                }else{
                    throw new Error("두 번째 숫자는 0이 될수 없습니다.");
                }
                break;
            default:
                throw new Error( operator + " 대신 알맞은 사칙연산 기호를 입력해 주세요.");
        }
        lastResult = result;
        return result;
   }

    public ArrayList<Double> getDoubleList(){
        return doubleList;
    }

    public void setAddDoubleList(){
        doubleList.add(lastResult);
    }

    public  void setRemoveDoubleList(){
        if(!doubleList.isEmpty()){
            doubleList.remove(0);
        }else{
            throw new Error("인덱스가 존재하지 않습니다.");
        }
    }

    // 원의 넓이 계산
    final  ArrayList<Double> circleList = new ArrayList<>();
    public  double calculateCircleArea(int r){
//        double circle = 0;

       double circle = getCircle(r) * circumference;

        return circle;
    }

    // 원주율 3.14 고정
    // static final -> 모든 영역에서 고정된 값으로 사용하는 불변값(3.14)으로 고정
    public static final Double circumference = 3.14;

    //거듭제곱
    public static final Integer POW = 2; //모든 영역에서 고정된 값으로 사용하는 불변값(2)으로 고정
    public static int getCircle(int r) {
        return (int) Math.pow(r, POW);
    }

    public ArrayList<Double> getCircleList(){
        return circleList;
    }

    public void setAddCircleList(int r){
       double circle = calculateCircleArea(r);
       circleList.add(circle);
    }

}
