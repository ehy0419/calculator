package org.example.lv2;

public class Calculator {
    public Integer calculate(int num1, int num2, char arithmetic) {


        // 사칙연산
        int result;
        // int result = 0 나눗셈 에러

        switch (arithmetic) {
            case '+':
                result = num1 + num2;
                break;
            case '-':    // 코드 서식 다시 지정 컨트롤+알트+L
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("올바른 연산 기호를 입력하세요.");
                return null;
        }

        return result;
    }
}