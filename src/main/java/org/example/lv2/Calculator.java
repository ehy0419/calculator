package org.example.lv2;

public class Calculator {
        public Integer calculate(int num1, int num2, char arithmetic) {


        // 사칙연산
        int result = 0;


        switch (arithmetic) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈에서 0으로 나눌 수 없습니다.");
                    return null;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("올바른 연산 기호를 입력하세요.");
                return null;
        }
    }
}