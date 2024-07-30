package calculator;

import java.util.ArrayList;

public class Calculator {
  private  ArrayList<Double> doubleList = new ArrayList<>();
    private Double lastResult;

    double  calulate(int num1, int num2, char operator){
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
}
