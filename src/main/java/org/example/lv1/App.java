package org.example.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // 양의 정수 입출력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = scn.nextInt();
        if (num1 < 0) {
            System.out.println("0 이상 양의 정수를 입력하세요");
        }

        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num2 = scn.nextInt();
        if (num2 < 0) {
            System.out.println("0 이상 양의 정수를 입력하세요");
        }

        // 사칙연산 기호 입력
        System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        char opr = scn.next().charAt(0);

        // switch 조건문 사칙연산
        switch (opr) {
            case '+':
                System.out.println(num1 + num2);
                break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                    case '*':
                        System.out.println(num1 * num2);
                        break;
                        case '/':
                            System.out.println(num1 / num2);
        }

        // 연산 진행 후 결과값 출력
        int result = 0;
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);
    }
}
