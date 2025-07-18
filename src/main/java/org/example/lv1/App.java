package org.example.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("exit를 입력하면 계산은 끝");

            // 양의 정수 입출력(0 포함)
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            char arithmetic = scanner.next().charAt(0);

            // switch 조건문 사칙연산
            int result = 0;  // result 연산에 맞는 int 선언 추가

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

                    break; // if 조건문에 입력 예외 사항 추가

                default:
                    System.out.println("올바른 연산 기호를 입력하세요."); // 사칙연산 기호 아닌 기호에 출력
            }

            // 결과값 출력
            System.out.println("결과: " + result);

            // 계산 종료 시퀀스
            System.out.println("더 계산하시겠습니까? (exit를 입력하면 계산은 끝)");
            String answer = scanner.next();
            if (answer.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}
