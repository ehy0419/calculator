package org.example.lv1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("계산을 시작합니다. (exit 입력 시 종료)");

            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            if (scn.hasNextInt()) {
                int num1 = scn.nextInt();
                if (num1 < 0) {
                    System.out.println("0 이상 양의 정수를 입력하세요.");
                    continue;
                }

                // 두 번째 숫자 입력
                System.out.print("두 번째 숫자를 입력하세요: ");
                if (scn.hasNextInt()) {
                    int num2 = scn.nextInt();
                    if (num2 < 0) {
                        System.out.println("0 이상 양의 정수를 입력하세요.");
                        continue;
                    }

                    // 연산자 입력
                    System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                    String op = scn.next();
                    if (op.equalsIgnoreCase("exit")) break;
                    if (op.length() != 1 || "+-*/".indexOf(op.charAt(0)) == -1) {
                        System.out.println("올바른 연산 기호를 입력하세요.");
                        continue;
                    }

                    char opr = op.charAt(0);
                    int result = 0;
                    boolean validOperation = true;

                    switch (opr) {
                        case '+': result = num1 + num2; break;
                        case '-': result = num1 - num2; break;
                        case '*': result = num1 * num2; break;
                        case '/':
                            if (num2 == 0) {
                                System.out.println("0으로 나눌 수 없습니다.");
                                validOperation = false;
                            } else {
                                result = num1 / num2;
                            }
                            break;
                    }

                    if (validOperation) {
                        System.out.println("결과: " + result);
                    }
                } else {
                    String invalid = scn.next(); // 잘못된 입력을 소비
                    if (invalid.equalsIgnoreCase("exit")) break;
                    System.out.println("양의 정수를 입력하세요.");
                    continue;
                }
            } else {
                String invalid = scn.next(); // 잘못된 입력을 소비
                if (invalid.equalsIgnoreCase("exit")) break;
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            System.out.println(); // 한 줄 공백
        }

        System.out.println("계산기를 종료합니다.");
    }
}