package org.example.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in); // Calculator 객체 인스턴스화

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

            // 연산 수행
            Integer result = calculator.calculate(num1, num2, arithmetic);

            if (result != null) {
                System.out.println("결과: " + result);
            }

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
