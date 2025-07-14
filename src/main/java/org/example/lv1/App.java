package org.example.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 양의 정수 입출력(0 포함)
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 사칙연산 기호 입력
        System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
        char opr = scanner.next().charAt(0);

        int result = 0;  // result 연산에 맞는 int 선언 추가

        // switch 조건문 사칙연산
        switch (opr) {
            case '+':
                result = num1 + num2;
                // System.out.println(result); 연산 출력 추가로 표시되서 주석처리
                break;
            case '-':    // 코드 서식 다시 지정 컨트롤+알트+L
                result = num1 - num2;
                // System.out.println(result); 연산 출력 추가로 표시되서 주석처리
                break;
            case '*':
                result = num1 * num2;
                // System.out.println(result); 연산 출력 추가로 표시되서 주석처리
                break;
            case '/':
//                if (num2 == 0) {
//                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                    }
                if (num2 != 0) {    // 비교연산자 i= 를 사용해서 num2에 0이 들어올 때 false 값으로 해서 연산
                    result = num1 / num2;  // 오류에 먼저 계산하지 않기.
                }
                // System.out.println(result); 연산 출력 추가로 표시되서 주석처리
                break; // if 조건문에 입력 예외 사항 추가

            default:
                System.out.println("올바른 연산 기호를 입력하세요."); // 사칙연산 기호 아닌 기호에 출력
        }

        // 결과값 출력
        System.out.println("결과: " + result);
    }
}
