package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    // 원의 넓이 계산
    final ArrayList<Double> resultList = new ArrayList<>();

    private Double lastResult;

    public  double calculateCircleArea(int r){
        lastResult = getCircle(r) * circumference;
        System.out.println("계산된 원의 크기 " + lastResult);
        return lastResult;
    }

    // 원주율 3.14 고정
    // static final -> 모든 영역에서 고정된 값으로 사용하는 불변값(3.14)으로 고정
    public static final Double circumference = 3.14;

    //거듭제곱
    public static final Integer POW = 2; //모든 영역에서 고정된 값으로 사용하는 불변값(2)으로 고정
    public static int getCircle(int r) {
        return (int) Math.pow(r, POW);
    }

    @Override
    public ArrayList<Double> getResult(){
        return resultList;
    }

    @Override
    public void setAddResult(){
        System.out.println("저장되는 원의크기 :" + lastResult);
        resultList.add(lastResult);
    }

    @Override
    public  void setRemoveResult(){
        if(!resultList.isEmpty()){
            resultList.remove(0);
        }else{
            throw new Error("인덱스가 존재하지 않습니다.");
        }
    }
}
